# BackendHotelAdministration
## Table of Contents

1. [Project Overview](#project-overview)
2. [Key Features](#key-features)
3. [Database Schema](#database-schema)
4. [Technologies Used](#technologies-used)
5. [User Roles and Permissions](#user-roles-and-permissions)
6. [Conclusion](#conclusion)

## Project Overview

The **Hotel Management System Database** is an integrated backend solution designed to enhance the operational efficiency of hotel management. This system consolidates essential functionalities such as bookings, guest information, room availability, billing, inventory management, staff scheduling, and customer relationship management (CRM) into a unified relational database architecture. By eliminating the limitations of traditional spreadsheet systems, this project aims to improve data integrity, scalability, and overall management processes within the hospitality industry.

## Key Features

- **Comprehensive Integration:** Seamlessly integrates all critical hotel management functions into a single, cohesive database system.

- **Robust Data Integrity:** Implements strict data validation rules and referential integrity constraints to ensure accurate and reliable data storage.

- **Scalable Architecture:** Designed to efficiently handle an increasing volume of data and operational complexity, adapting to the evolving needs of the hotel.

- **Advanced Query Capabilities:** Utilizes SQL for sophisticated querying, allowing for customized reports and insightful data analysis to drive informed decision-making.

- **Enhanced Security:** Provides robust access controls to safeguard sensitive data while ensuring appropriate permissions for different user roles.

## Database Schema

The following is the defined structure of the database, outlining key entities and their attributes:

- **Users**
  - `UserID` (INT PRIMARY KEY)
  - `UserName` (VARCHAR)
  - `Password` (VARCHAR)

- **Admin**
  - `AdminID` (INT PRIMARY KEY)
  - `UserName` (VARCHAR)
  - `Password` (VARCHAR)

- **Booking**
  - `BookingID` (INT PRIMARY KEY)
  - `UserID` (FOREIGN KEY)
  - `NumberOfGuests` (INT)
  - `Date` (DATE)

- **Room Details**
  - `RoomID` (INT PRIMARY KEY)
  - `BookingID` (INT FOREIGN KEY)
  - `RoomType` (VARCHAR)

- **Payment**
  - `UserID` (INT FOREIGN KEY)
  - `PaymentID` (INT PRIMARY KEY)
  - `Date` (DATE)
  - `TotalCost` (DECIMAL)

- **Staff Details**
  - `StaffID` (INT PRIMARY KEY)
  - `FullName` (VARCHAR)
  - `RoomID` (FOREIGN KEY)
  - `Availability` (NUMERIC)
  - `QUERY` (VARCHAR)

- **Inventory**
  - `ItemID` (INT PRIMARY KEY)
  - `ItemName` (VARCHAR)
  - `StockDetails` (VARCHAR)
  - `ReorderCount` (INT)
  - `Status` (VARCHAR)

## Technologies Used

- **Backend Framework:** Java, Spring Boot
- **Database Management System:** MySQL
- **Development Tools:** Visual Studio, Talend API

## User Roles and Permissions

The system accommodates multiple user roles, each with specific access rights and responsibilities:

- **Administrators:** 
  - Full access to manage user accounts, configure database settings, and conduct backups.
  
- **Guests:** 
  - Restricted access for online payment processing, billing inquiries, and reservation checks.

- **Staff Members:** 
  - Access to manage reservations, check-in/out procedures, inventory management, and customer data.

## Conclusion

The **Hotel Management System Database** provides a sophisticated backend solution designed to streamline hotel management processes and enhance guest experiences. By integrating critical functionalities into a unified system, this project addresses the limitations of traditional management methods.

Key benefits include:

- **Improved Operational Efficiency:** Centralizing data management eliminates redundancies and enhances workflow across various hotel departments.
- **Robust Data Integrity and Security:** The system enforces data validation and security measures, ensuring the accuracy and confidentiality of sensitive information.
- **Scalability and Flexibility:** The architecture is built to accommodate growth, allowing the hotel to adapt to changing demands and expanding operations.

This database system is an essential asset for effective hotel operations, leveraging advanced technology and best practices to establish a modern approach to hotel management.

