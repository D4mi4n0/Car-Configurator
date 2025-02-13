# Car Configurator

"Car Configurator" is a Java application for configuring cars. It allows users to select the type of car, brand, price, color, engine, wheels, and additional options.
****

## Requirements

- Java 11 or higher (in this case, I used Java 21)
- Gradle 6.0 or higher (in this case, I used Gradle 8.11)

## How to run the project (from the terminal)

1. Clone this repository on your desktop, writing this following commands:
   ```sh
   cd desktop
   
   git clone https://github.com/D4mi4n0/Car-Configurator.git

2. Then search the repository cloned in your desktop
   ```sh
   cd Car-Configurator
   
3. Navigate to the project directory, in order to execute correctly the last two commands:
   ```sh
   cd CarConfigurator
   
4. Write the following command, in order to compile the project and to create the distributable files for this project:
   ```sh
   gradle build
   
5. Then write the following command, in order to run the application:
   ```sh
   gradle run
   
****

## How the configurator works (by following these steps)

1. Select Car Type: The user is prompted to select the type of car (Luxury Car, Sports Car, or Electric Car).

2. Select Brand: The user is prompted to select the brand of the car.

3. Select Price: The user is prompted to select the price of the car (between 10000 and 200000 USD).

4. Select Color: The user is prompted to select the color of the car.

5. Select Engine: The user is prompted to select the engine of the car (between 100 and 500 horsepower).

6. Select Wheels: The user is prompted to select the number of wheels for the car (between 1 and 4).

7. Select Weight for Wheels: The user is prompted to select the weight of the wheels (between 6 and 10 kg).

8. Select Distinctive feature:
   1) For Luxury Car: The user is prompted to select between Seat Massage System or Virtual Assistant.
   2) For Sports Car: The user is prompted to select the Top Speed.
   3) For Electric Car: The user is prompted to select the Battery Capacity.

9. (Optionable) Select Additional Options: The user is prompted to select additional options for the car (Air Conditioning - Leather Seats - SunRoof)

10. (Optionable) Select Optional Material: The user is prompted to select the additional material of the car (between Carbon Fiber and Alcantara).

11. Configurator Summary: The user is prompted to see the summary of the car configuration.

The application with the UI will guide the user through the configuration process.

****

# One more thing...

If you are reading this, would you gift me a Lexus LBX, please? 🚗🎁

****

I almost fainted while writing the code :P
