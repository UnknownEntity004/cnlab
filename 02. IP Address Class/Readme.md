# IP Address Analyzer in Java

This project provides a simple Java program to determine the class and type (public or private) of a given IP address.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.

## Files

- `IPAddressAnalyzer.java`: The main Java file containing the logic to validate the IP address, determine its class, and check if it is a public or private address.

## Steps to Run the Program

### 1. Compile the Program

First, you need to compile the Java source file. Open a terminal or command prompt, navigate to the directory containing the source file, and run:

```sh
javac IPAddressAnalyzer.java
```

### 2. Run the Program

To run the program, use the following command:

```sh
java IPAddressAnalyzer
```

The program will analyze the IP address defined in the `main` method and print its class and type.

## How It Works

- **Validation**:
  - The `isValidIPAddress` method splits the IP address into parts using the `.` character.
  - It checks if the number of parts is exactly 4.
  - It then iterates through each part, attempting to convert it to an integer and ensuring it falls within the range 0-255. If any part is not a valid integer or is out of range, the method returns false.

- **Class Determination**:
  - The `getClassOfIPAddress` method determines the class of the IP address based on the first octet.
    - Class A: First octet 1-126
    - Class B: First octet 128-191
    - Class C: First octet 192-223
    - Class D: First octet 224-239 (Multicast)
    - Class E: First octet 240-255 (Experimental)

- **Type Determination**:
  - The `getTypeOfIPAddress` method checks if the IP address falls within the known private IP address ranges:
    - 10.0.0.0 to 10.255.255.255
    - 172.16.0.0 to 172.31.255.255
    - 192.168.0.0 to 192.168.255.255

## Example IP Addresses

Here are some examples of different IP addresses and their expected outputs:

1. **IP Address: 192.168.1.1**
   - **Class**: C
   - **Type**: Private

2. **IP Address: 10.0.0.1**
   - **Class**: A
   - **Type**: Private

3. **IP Address: 172.16.5.4**
   - **Class**: B
   - **Type**: Private

4. **IP Address: 8.8.8.8**
   - **Class**: A
   - **Type**: Public

5. **IP Address: 224.0.0.1**
   - **Class**: D
   - **Type**: Public (Multicast)

6. **IP Address: 240.0.0.1**
   - **Class**: E
   - **Type**: Public (Experimental)

## Notes

- Ensure that the IP address in the `main` method is a valid IPv4 address before running the program.
- You can modify the `ipAddress` variable in the `main` method to test different IP addresses.
- The program only handles IPv4 addresses.

## Troubleshooting

- If the program outputs "Invalid IP address," ensure that the IP address follows the correct IPv4 format (e.g., "192.168.1.1").
- Make sure no part of the IP address is out of the range 0-255.

## License

This project is open-source and available under the MIT License.