Feature: Battery Replacements and Dynamically set the battery level configuration

  Scenario: Customer dynamically selects locations for battery replacements
    Given the customer has access to the cloud platform
    When the customer dynamically selects specific locations for battery replacements
    Then the system should use these selected locations for battery replacements


  Scenario: Customer dynamically sets battery level threshold configuration
    Given the customer has access to the cloud platform
    When the customer dynamically sets the battery level configuration
    Then the system should use this configuration for monitoring battery levels

  Scenario: LED blinks when battery level is below the threshold in selected locations
    Given the battery level of a logger is below the dynamically set threshold
    And the logger is in a location selected for battery replacements
    When the system checks the battery level
    Then the LED outside the logger should blink
    And the LED in other locations should remain off

  Scenario: Customer replaces the battery in selected locations
    Given the system has identified a logger in a location for battery replacement
    When the customer initiates the battery replacement process
    Then the system should update the battery with a new one
    And the logger should resume normal operation