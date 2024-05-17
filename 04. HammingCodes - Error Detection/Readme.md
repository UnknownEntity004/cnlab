# SimpleHammingCode

This project provides a simplified Java program to perform error detection and correction for 7/8 bits ASCII codes using Hamming codes.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.

## Files

- `SimpleHammingCode.java`: The main Java file containing the logic for generating and correcting Hamming codes.

## How to Run the Program

### 1. Compile the Program

First, you need to compile the Java source file. Open a terminal or command prompt, navigate to the directory containing the source file, and run:

```sh
javac SimpleHammingCode.java
```

### 2. Run the Program

To run the program, use the following command:

```sh
java SimpleHammingCode
```

The program will prompt you to enter the ASCII code as a binary string and then display the Hamming code. It will also prompt you to enter the received Hamming code to correct any errors.

## How It Works

1. **Generating Hamming Code**:
    - The `generateHammingCode` method calculates the number of redundant bits needed (`r`) and inserts them into the appropriate positions in the data.
    - It then calculates the parity bits for these positions and forms the complete Hamming code.

2. **Correcting Hamming Code**:
    - The `correctHammingCode` method calculates the parity bits for the received Hamming code to detect any errors.
    - If an error is detected (i.e., the parity bits indicate a non-zero error position), the erroneous bit is flipped to correct the code.

3. **Helper Methods**:
    - `calculateRedundantBits`: Determines the number of redundant bits needed for the given length of data bits.
    - `isPowerOfTwo`: Checks if a number is a power of two, which helps identify positions of redundant bits.
    - `calculateParityBit`: Calculates the parity bit for a given position by performing an XOR operation on the relevant bits.

## Example Usage

1. **Run the program**:
   ```sh
   java SimpleHammingCode
   ```

2. **Input**:
   ```
   Enter the ASCII code (7/8 bits) as a binary string: 1010101
   Enter the received Hamming code: 01110101101
   ```

3. **Output**:
   ```
   Original Data: 1010101
   Hamming Code: 01110101101
   Enter the received Hamming code: 01110101101
   No error detected.
   Corrected Code: 01110101101
   ```

### Example IP Addresses

Here are some examples of different IP addresses and their expected outputs:

- **Input**:
  ```
  Enter the ASCII code (7/8 bits) as a binary string: 1100110
  Enter the received Hamming code: 01001100110
  ```

- **Output**:
  ```
  Original Data: 1100110
  Hamming Code: 01001100110
  Enter the received Hamming code: 01001100110
  No error detected.
  Corrected Code: 01001100110
  ```

- **Input**:
  ```
  Enter the ASCII code (7/8 bits) as a binary string: 1010101
  Enter the received Hamming code: 01110101111
  ```

- **Output**:
  ```
  Original Data: 1010101
  Hamming Code: 01110101101
  Enter the received Hamming code: 01110101111
  Error detected and corrected at position: 10
  Corrected Code: 01110101101
  ```

## Notes

- Ensure that the input is a valid 7 or 8 bits binary string before running the program.
- The program can detect and correct single-bit errors in the received Hamming code.

## License

This project is open-source and available under the MIT License.