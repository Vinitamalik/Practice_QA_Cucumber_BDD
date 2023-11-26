package Common;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;

public class FileUtil {

    public static File dir_folder = null;
    //  private static Logger log = new MyLogger().getLogger();
    private File resFile = null;

    public FileUtil() {
        projDirFolder("Script Files");
    }

    /**
     * create a directory folder for framework
     * @param f_name directory name
     * @return directory folder
     */
    File projDirFolder(String f_name) {
        dir_folder = new File(System.getProperty("user.dir") + File.separator + f_name);
        if (dir_folder.exists()) {
            //  log.info("found directory folder >>> " + dir_folder.getPath());
        } else {
            if (dir_folder.mkdirs()) {
                // log.info("Directory folder created >>> " + dir_folder.getPath());
            } else {
                // log.info("couldn't create directory folder!!");
            }
        }
        return dir_folder;

    }

    /**
     * get framework directory file object
     * @return
     */
    public File getProjDirFolder() {
        return dir_folder;
    }

    /**
     * create directory folder
     * @param dirName directory path
     * @return directory file object
     */
    public synchronized File createDir(String dirName) {
        File dir = new File(dirName);
        if (dir.exists()) {
            // log.info("found directory folder >>> " + dir.getPath());
        } else {
            if (dir.mkdirs()) {
                //   log.info("Directory folder created >>> " + dir.getPath());
            } else {
                //  log.info("couldn't create directory folder!!");
            }
        }
        return dir;
    }

    /**
     * extract file if not exist
     * @param srcf source directory path
     * @param desf extraction path
     * @return extract file object
     */
    public File fileExtractor(String srcf, String desf) {
        File trgFile = null;
        FileOutputStream out = null;
        synchronized (srcf.intern()) {
            trgFile = new File(dir_folder + File.separator + desf);
            File pFile = new File(trgFile.getParent());
            if (!pFile.exists())
                pFile.mkdirs();
            if (trgFile.canExecute()) {
                //  log.info(trgFile.getAbsolutePath() + " file already exist.");
            } else {
                //  log.info("Extracting file please wait...");
                try (InputStream in = FileUtil.class.getClassLoader().getResourceAsStream(srcf);
                ) {
                    if (in == null) throw new Error("Couldn't get source file>> " + srcf);
                    out = new FileOutputStream(trgFile);
                    int i;
                    while ((i = in.read()) != -1) {
                        out.write(i);
                    }
                } catch (FileNotFoundException e) {
                    // log.catching(e);
                } catch (IOException e) {
                    // log.catching(e);
                } finally {
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            //  log.catching(e);
                        }
                    }
                }
            }
        }
        return trgFile;
    }

    /**
     * extract file to a temp directory
     *
     * @param resFilePath source file directory
     * @param extFileName temp file name
     * @param fileEXT     temp file extension
     * @return temp file object
     */
    public File tempExtractor(String resFilePath, String extFileName, String fileEXT) {
        File tmpFile = null;
        try (InputStream in = FileUtil.class.getClassLoader().getResourceAsStream(resFilePath)) {
            tmpFile = File.createTempFile(extFileName, fileEXT);
            FileOutputStream out = new FileOutputStream(tmpFile);
            //   System.out.println(in);
            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }

        } catch (FileNotFoundException e) {
            // log.catching(e);
        } catch (IOException e) {
            // log.catching(e);
        }
        tmpFile.deleteOnExit();
        return tmpFile;
    }

    /**
     * extract text file contents
     *
     * @param srcf         source file directory
     * @param desf         extracted file path
     * @param toBeReplaced overwrite file if exist flag
     * @return extracted file object
     */
    public File textExtractor(String srcf, String desf, boolean toBeReplaced) {
        File trgFile = null;
        synchronized (srcf.intern()) {
            trgFile = new File(dir_folder + File.separator + desf);
            File pFile = new File(trgFile.getParent());
            if (!pFile.exists())
                pFile.mkdirs();
            BufferedWriter outf_buff = null;
            PrintWriter pw = null;
            if (trgFile.canExecute() && !toBeReplaced) {
                // log.info("file " + desf + " already exist.");
            } else {
                // log.info("Extracting file " + desf + " ,please wait...");
                try (InputStream in = FileUtil.class.getClassLoader().getResourceAsStream(srcf);
                ) {
                    if (in == null) throw new Error("Couldn't find source file>> " + srcf);
                    FileWriter outf = new FileWriter(trgFile);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
                    outf_buff = Files.newBufferedWriter(Paths.get(trgFile.getPath()));
                    pw = new PrintWriter(outf);
                    String i;
                    while ((i = br.readLine()) != null) {
                        pw.println(i);
                    }
                    outf.flush();
                    outf.close();
                    pw.close();
                    outf_buff.close();
                } catch (FileNotFoundException e) {
                    //  log.catching(e);
                } catch (IOException e) {
                    //  log.catching(e);
                }
            }
        }
        return trgFile;
    }

    /**
     * write to file
     *
     * @param file  file object
     * @param exist overwrite if exist else replace
     * @param text  text
     */
    public void fileWriter(File file, Boolean exist, String text) {
        synchronized (file) {
            try (FileWriter out = new FileWriter(file, exist)) {
                out.write("\n");   //skip  line
                out.write(text);
            } catch (IOException e) {
                // log.catching(e);
            }
        }
    }

    /**
     * search file in a given path
     *
     * @param dirPath directory path
     * @param fname   file name
     * @return file path if found
     */
    public String searchDir(String dirPath, String fname) {
        File pth = new File(dirPath);
        String trgtPath = "";
        if (resFile != null && resFile.getName().toLowerCase().equals(fname.toLowerCase()))
            return resFile.getPath();
        else resFile = null;
        pth.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().equals(fname.toLowerCase())) {
                    resFile = new File(dir.getPath() + File.separator + name);
                    return true;
                } else
                    return !searchDir(dir.getPath() + File.separator + name, fname).equals("");
            }
        });
        if (resFile != null)
            trgtPath = resFile.getPath();
        return trgtPath;
    }

    /**
     * delete file
     *
     * @param filePath file path
     * @return is deleted successfully
     */
    public boolean deleteFile(String filePath) {
        File f = null;
        synchronized (filePath.intern()) {
            f = new File(filePath);
            if (f.exists()) {
                // log.info("file: " + filePath + " exist, and deletion status>> " + f.delete());
            }
        }
        return !f.exists();
    }

    /**
     * create a file inside framework folder directory
     *
     * @param filename file path
     * @return created file object
     */
    public File createFile(String filename) {
        File f = null;
        synchronized (filename.intern()) {
            f = new File(dir_folder + File.separator + filename);
            if (f.exists()) {
                //   log.info(filename + " exist.");
            } else {
                try {
                    f.createNewFile();
                    //   log.info(filename + " created.");
                } catch (IOException e) {
                    ////   log.catching(e);
                }
            }
        }
        return f;
    }

    /**
     * copy file from source to destination
     *
     * @param source source path
     * @param dest   destination path
     */
    public void copyFile(File source, File dest) {
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            // log.catching(e);
        } catch (IOException e) {
            //log.catching(e);
        } finally {
            try {
                input.close();
                output.close();
            } catch (IOException e) {
                //  log.catching(e);
            }

        }
    }

    public String getResPath(String fileName) {
        String path = "";
        URL in = FileUtil.class.getClassLoader().getResource("testData");
        //    System.out.println(in.getProtocol());
        if (in.getProtocol().startsWith("f")) {
            try {
                File p = new File(new File(in.toURI()).getParent());
                path = new FileUtil().searchDir(p.getPath(), fileName);
                if (path.equals("")) return "";
                path = path.split(p.getName())[1];
                //  log.info("getting resource path>>" + path);
            } catch (URISyntaxException e) {
                //log.warn("Exception Message: " + e.getMessage() + "\n" + ExceptionUtils.getStackTrace(e));
            }
            return path;
        }
        String me = FileUtil.class.getName().replace(".", "/") + ".class";
        in = FileUtil.class.getClassLoader().getResource(me);
        String jarPath = in.getPath().substring(5, in.getPath().indexOf("!"));
        try {
            JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"));
            List<JarEntry> x = jar.stream().filter(j -> {
                        String n = "";
                        if (j.getName().toLowerCase().contains(fileName.toLowerCase())) {
                            String[] t = j.getName().split("/");
                            n = t[t.length - 1];
                        }
                        return n.toLowerCase().equals(fileName.toLowerCase());
                    })
                    .collect(Collectors.toList());
            for (JarEntry e : x) {
                //    System.out.println(">>> "+e.getName());
                path = e.getName();
            }
            //  log.info("getting resource path>>" + path);
        } catch (IOException e) {
            //log.warn("Exception Message: " + e.getMessage() + "\n" + ExceptionUtils.getStackTrace(e));
        }
        return path;
    }

    public File getFileByFullPath(String filePath) throws FileNotFoundException {
        File f = null;
        // log.info("getting file with path>>" + filePath);
        synchronized (filePath.intern()) {
            f = new File(filePath);
            if (f.exists() && f.isFile()) {
                return f;
            } else throw new FileNotFoundException("Path not found: " + filePath);
        }
    }
}
