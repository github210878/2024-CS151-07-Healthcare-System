README

Overview

This is a program that mimics a real-life healthcare system. This includes multiple classes that represent different real components of a healthcare system starting from a hospital to medication that the patient consumes.

Design

The primary components of our healthcare system are Hospitals, Patients, Doctors, and Healthcare System files. The System contains multiple hospitals, which contain Doctors and Patients.

The Doctor can interact with reservations and medication and this applies to the patient as well. There are also rooms that the doctors can operate in. There are three kinds of rooms \- ER room, ICU room, and appointment room. The ER room has emergency priority with emergency equipment. The ICU rooms have different levels of care and the patients can be isolated. Each appointment has a doctor assigned to them and has appointments based on time slots.

Installation Instructions

1. Install java  
2. Download the source files  
3. Open Command Line  
4. Type “javac (insert directory of source files)”  
5. The last command should have created a .jar file and make sure to find its directory.  
6. To run the program, type in the command line “java \-jar (insert directory of .jar file)”

Usage

Our UI allows the user to manipulate our primary components with CRUD. We have two pages that the user can access, either as a Doctor or as a Patient. The name of the Doctor/Patient must be entered after selection. If the user selects the Doctor, their commands are to view patients, update the schedule, or exit. Doctors can also prescribe medication. If the user selects Patient, they can get notifications for their next prescription refill, view their profile, and check prescriptions.

Contributions

Brian Tran \- Hospital, ICURoom, UML, README.  
Edmond Li \- Staff, Doctor, Patient, Medication, refillNotification.  
Isa Pudiyapura \- UI and Navigation  
Huu Tinh Nguyen \- ERROOM, Reservation, some UI, appointmentRoom.

