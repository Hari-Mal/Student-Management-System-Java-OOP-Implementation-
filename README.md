This project is a Student Management System developed in Java using NetBeans, designed to manage and evaluate both undergraduate and postgraduate students at a university. The system leverages core Object-Oriented Programming (OOP) concepts such as Encapsulation, Inheritance, and Polymorphism, including method overriding and overloading, to provide a structured and modular approach to handling student data.

Key Features:

Encapsulation: All student data attributes (Name, Registration Number, GPA, and Research Area) are protected and accessed through getter and setter methods, ensuring controlled and secure updates.

Inheritance: The system differentiates student types by creating subclasses for UndergraduateStudent and PostgraduateStudent, inheriting common properties from the Student superclass.

Polymorphism:

Overriding: Each subclass implements its own version of the getPerformance() method to evaluate students based on distinct criteria.

Overloading: The getPerformance(double researchScore) method in the postgraduate class calculates final performance based on a weighted score of GPA and research contribution.

Dynamic Performance Evaluation:

Undergraduate students are classified into “First Class”, “Second Upper”, “Second Lower”, “General”, or “Fail” based on GPA.

Postgraduate students are classified into “Distinction”, “Merit”, “Pass”, or “Fail”, with research score integration for detailed performance assessment.

Interactive Testing: The system allows creation of multiple student objects and demonstrates evaluation under different GPA and research score scenarios.

Technologies Used: Java, NetBeans IDE, OOP Principles

Outcome:
Students can be effectively categorized and evaluated based on both academic performance and research contributions, demonstrating advanced Java programming concepts and practical application of OOP in real-world educational systems.
