package Common;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONUtils {

    private List<JSONObject> jsonObjs = new ArrayList<>();


    /**
     * read jsonObject from a file
     *
     * @param filePath json file path
     * @return json file contents
     */
    public String readJsonFile(String filePath) {
        StringBuilder s = new StringBuilder();
        try (FileReader reader = new FileReader(filePath);
             BufferedReader b = new BufferedReader(reader)) {
            b.lines().forEach(i -> {
                s.append(i);
            });
        } catch (FileNotFoundException e) {

            //log.warn("Exception Message: " + e.getMessage() + "\n" + ExceptionUtils.getStackTrace(e));
        } catch (IOException e) {
            // log.warn("Exception Message: " + e.getMessage() + "\n" + ExceptionUtils.getStackTrace(e));
        }
        return s.toString();
    }

    /**
     * parse given file name to json then get the json object
     *
     * @param fileName json file name
     * @return JsonObject of file
     */
    public JSONObject getJsonFileObj(String fileName) {
        FileUtil f = new FileUtil();
        File extF;
        String resP;
        String extFPath = f.searchDir(f.getProjDirFolder().getPath(), fileName);
        System.out.println(extFPath);
        if (!extFPath.equals("")) extF = new File(extFPath);
        else {
            resP = f.getResPath(fileName);
            //  log.info("getting JSON file with name:" + fileName + " and path >> " + resP);
            if (resP.equals("")) return null;
            extF = f.fileExtractor(resP, resP);
        }
        return new JSONObject(readJsonFile(extF.getPath()));
    }

    /**
     * get objTree jsonObject from the given jsonObject
     *
     * @param jsonObj parent jsonObject
     * @param objTree Array of JsonObjects tree  [ex for jsonObject with name 'C':{'A', 'B', 'C'} ]
     * @return JsonObject if exist
     */
    public Object getJsonObj(JSONObject jsonObj, Object[] objTree) {
        JSONArray jsonArray = new JSONArray();
        for (Object e : objTree) {
            if (e.toString().contains(" ")) {
                e = e.toString().trim();
            }
            if (jsonArray.toList().size() > 0) {
                int x = -1;
                try {
                    x = Integer.parseInt(e.toString());
                } catch (NumberFormatException ignored) {
                }
                ;
                if (x != -1) {
                    jsonObj = jsonArray.optJSONObject(x);
                    if (jsonArray.optJSONArray(x) != null)
                        jsonArray = jsonArray.getJSONArray(x);
                    else if (jsonObj == null) return jsonArray.get(Integer.parseInt(e.toString()));
                    else
                        jsonArray = new JSONArray();
                }
            } else if (jsonObj.optJSONObject(e.toString()) != null)
                jsonObj = jsonObj.getJSONObject(e.toString());

            else if (jsonObj.optJSONArray(e.toString()) != null) {
                //  log.info("Getting Array " + jsonObj.optJSONArray(e.toString()));
                jsonArray = jsonObj.getJSONArray(e.toString());
            } else if (Arrays.asList(objTree).indexOf(e) != (objTree.length - 1)) {
                //  log.info("Json object with name '" + e + "' not exist!!!");
                jsonObj = null;
            }
        }
        //  log.info("Found Json data>>" + (jsonArray.toList().isEmpty() ? jsonObj.toString() : jsonArray.toString()));
        if (!jsonArray.toList().isEmpty())
            return jsonArray;
        else return jsonObj;
    }

    /**
     * write jsonObject into file
     *
     * @param filePath json file path
     * @param c        json object as string
     * @return is written successfully
     */
    public boolean writeJsonFile(String filePath, String c) {
        StringBuilder s = new StringBuilder();
        try (FileWriter writer = new FileWriter(filePath);
             BufferedWriter b = new BufferedWriter(writer)) {
            b.write(c);
        } catch (FileNotFoundException e) {
            //   log.warn("Exception Message: " + e.getMessage() + "\n" + ExceptionUtils.getStackTrace(e));
        } catch (IOException e) {
            //  log.warn("Exception Message: " + e.getMessage() + "\n" + ExceptionUtils.getStackTrace(e));
        }
        return true;
    }


    /**
     * create or set Json Object key value
     *
     * @param jsonFileName json file name
     * @param objTree      Json Object tree
     * @param key          key name
     * @param value        key value
     */
    public void setJsonObjkeyValue(String jsonFileName, String[] objTree, String key, String value) {
        synchronized (jsonFileName.intern()) {
            JSONObject jsonObj = getJsonFileObj(jsonFileName);
            //   log.info("Setting key:" + key + " and value:" + value + " in Json tree:" + Arrays.asList(objTree) + " and jsone file:" + jsonFileName);
            FileUtil fUtil = new FileUtil();
            File f = new File(fUtil.getProjDirFolder() + File.separator + fUtil.getResPath(jsonFileName));
            if (!f.exists())
                throw new Error("Json file with name '" + jsonFileName + "' not found!");
            Object j = getJsonObj(jsonObj, objTree);
            if (j == null) throw new Error("Object with keyTree>> " + Arrays.asList(objTree) + " not found!");
            else if (j instanceof JSONObject) {
                //      log.info("Setting key: " + key + " and value:" + value + " in Json >>" + j.toString());
                ((JSONObject) j).put(key, value);
            } else if (j instanceof JSONArray) {
                List l = ((JSONArray) j).toList();
                //     log.info("Adding >> " + value + " in Array >>" + l);
                if (!l.contains(value))
                    ((JSONArray) j).put(value);
            }
            writeJsonFile(f.getPath(), jsonObj.toString());
        }
    }





}
