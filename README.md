CPE102 Lab 5 — Java Hospital Management System (Plain README)
==============================================================

Author: Beartu
Course: CPE 102 – Computer Programming II (Spring 2024–2025)
Assignment: Lab 5

--------------------------------------------------

Project Goals
-------------

This Java project implements a simple **Hospital Management System** consisting of the following:

1. **Patient Class**:
   - Represents a hospital patient with fields for name, ID, entry date, and assigned doctor.
   - Includes constructors (default and copy), getters, setters, toString, and equals methods.

2. **Doctor Class**:
   - Represents a doctor with fields for name, ID, specialization, and assigned patients.
   - Includes patient assignment logic (up to 4 patients), constructors, getters, setters, toString, and equals.

3. **Hospital Class**:
   - Represents the hospital with arrays for doctors and patients.
   - Methods to add patients/doctors, assign doctors to patients, find patients/doctors by ID, and remove patients.

4. **Main Class**:
   - Tests all features by creating patients, doctors, and hospital objects and calling the implemented methods.

--------------------------------------------------

Folder Structure
----------------

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources (doctor.java, patient.java, hospital.java, main.java)
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder.

--------------------------------------------------

Build & Run
-----------

Requirements:
- JDK 17 or later
- Command-line interface

To compile:
    javac -d bin src/*.java

To run:
    java -cp bin main

--------------------------------------------------

Implementation Notes
--------------------

- Patient and Doctor objects use deep copies to prevent privacy leaks.
- Doctor objects automatically manage patient assignments and availability.
- Hospital class centrally manages patients and doctors with size constraints.
- Testing involves creating instances, assigning patients, and displaying information through console output.

--------------------------------------------------

End of README