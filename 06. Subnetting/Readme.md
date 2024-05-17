# Subnet Calculator

This Java program is a simple subnet calculator that determines the class, subnet mask, network address, and last address of an IP address entered by the user.

## Overview

The program prompts the user to enter an IP address and calculates the class of the IP address based on its first octet. It then determines the appropriate subnet mask and calculates the network address and the last address of the subnet.

## Running the Program

To run the program, follow these steps:

1. Compile the Java file:
   ```sh
   javac Subnet.java
   ```

2. Run the compiled program:
   ```sh
   java Subnet
   ```

3. Follow the on-screen instructions:
   - Enter the IP address when prompted.

## Example Usage

Here's an example interaction with the program:

```
ENTER IP:
192.168.1.10
Class C IP Address
SUBNET MASK:
255.255.255.0
First IP of block: 192.168.1.0
Last IP of block: 192.168.1.255
```

In this example, the program identifies the input IP address as a Class C address, determines the appropriate subnet mask, and calculates the network address and last address of the subnet.

## Notes

- The program assumes valid input in the form of an IPv4 address.
- It provides basic functionality for subnet calculation and can be expanded to include additional features such as CIDR notation support or error handling for invalid input.