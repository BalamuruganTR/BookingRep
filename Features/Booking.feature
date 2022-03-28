Feature: Booking the flight
@smoke
  Scenario: Launch the browser and goto main url
    Given goto main url
    Then go to Flights

  Scenario: Typing booking details
    Given Select the Onway option
    When Enter the Booking Details
    Then Select the lowest flight

  Scenario: Ticket type
    When Click Standard ticket type

  Scenario: Enter the passengers details
    Given Entering contact details
    When Entering the passanger details

  Scenario: Luggage details
    When leave default

  Scenario: Payment process
    Then Enter payment details
    Then Close the browser
