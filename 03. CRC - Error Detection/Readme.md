# CRCErrorDetection

This project provides a simple Java program to perform error detection for 7/8 bits ASCII codes using CRC (Cyclic Redundancy Check).

## Prerequisites

- Java Development Kit (JDK) installed on your machine.

## Files

- `CRCErrorDetection.java`: The main Java file containing the logic to validate the IP address, determine its class, and check if it is a public or private address.

## How to Run the Program

### 1. Compile the Program

First, you need to compile the Java source file. Open a terminal or command prompt, navigate to the directory containing the source file, and run:

```sh
javac CRCErrorDetection.java
```

### 2. Run the Program

To run the program, use the following command:

```sh
java CRCErrorDetection
```

The program will prompt you to enter the ASCII code as a binary string and then display the CRC code, transmitted message, and the result of error detection on the received message.

## How It Works

- **CRC Calculation**:
  - The `computeCRC` method:
    - Pads the input with `n-1` zeros (where `n` is the length of the polynomial).
    - Performs binary division using the polynomial to compute the CRC.
    - Returns the CRC code.

- **Error Checking**:
  - The `isValidMessage` method:
    - Performs binary division on the received message.
    - Checks if the remainder is all zeros, indicating no error.

## Example Usage

1. **Run the program**:
   ```sh
   java CRCErrorDetection
   ```

2. **Input**:
   ```
   Enter the ASCII code (7/8 bits) as a binary string: 1010101
   Enter the received message: 101010100000101
   ```

3. **Output**:
   ```
   Original Data: 1010101
   CRC Code: 00000101
   Transmitted Message: 101010100000101
   No error detected in the received message.
   ```

### Example IP Addresses

Here are some examples of different IP addresses and their expected outputs:

- **Input**:
  ```
  Enter the ASCII code (7/8 bits) as a binary string: 1100110
  Enter the received message: 110011000001001
  ```

- **Output**:
  ```
  Original Data: 1100110
  CRC Code: 00001001
  Transmitted Message: 110011000001001
  No error detected in the received message.
  ```

- **Input**:
  ```
  Enter the ASCII code (7/8 bits) as a binary string: 1010101
  Enter the received message: 101010100000111
  ```

- **Output**:
  ```
  Original Data: 1010101
  CRC Code: 00000101
  Transmitted Message: 101010100000101
  Error detected in the received message.
  ```

## Notes

- Ensure that the IP address in the `main` method is a valid IPv4 address before running the program.
- You can modify the `ipAddress` variable in the `main` method to test different IP addresses.
- The program only handles IPv4 addresses.

## Troubleshooting

- If the program outputs "Invalid IP address," ensure that the IP address follows the correct IPv4 format (e.g., "192.168.1.1").
- Make sure no part of the IP address is out of the range 0-255.

## License

This project is open-source and available under the MIT License.