# Linux Networking Commands

This document provides an overview of networking commands that are commonly used in Linux operating systems. These commands can be executed in the terminal to perform various network-related tasks.

## Commands Overview

### `ifconfig`

The `ifconfig` command is used to configure and display information about network interfaces.

```sh
# Display information about all network interfaces
ifconfig

# Display detailed information about a specific interface
ifconfig eth0

# Assign an IP address to a network interface
sudo ifconfig eth0 192.168.1.10
```

### `ping`

The `ping` command is used to test the connectivity between the local host and a remote host by sending ICMP echo request packets.

```sh
# Syntax: ping [options] destination
ping google.com

# Send a specified number of ping requests
ping -c 4 google.com
```

### `traceroute`

The `traceroute` command is used to trace the route that packets take to reach a destination host.

```sh
# Syntax: traceroute [options] destination
traceroute google.com
```

### `nslookup`

The `nslookup` command is used to query DNS servers and resolve domain names to IP addresses.

```sh
# Syntax: nslookup [options] [hostname]
nslookup google.com

# Query a specific DNS server
nslookup google.com 8.8.8.8
```

### `netstat`

The `netstat` command is used to display network connections, routing tables, interface statistics, masquerade connections, and multicast memberships.

```sh
# Display all active connections
netstat

# Display active TCP connections
netstat -t

# Display active listening ports
netstat -l
```

### `arp`

The `arp` command is used to display and modify the Address Resolution Protocol (ARP) cache.

```sh
# Display the ARP cache
arp -a

# Flush the ARP cache
sudo arp -d
```

### `route`

The `route` command is used to display and modify the IP routing table.

```sh
# Display the routing table
route

# Add a static route
sudo route add -net 192.168.1.0 netmask 255.255.255.0 gw 192.168.0.1
```

### `ssh`

The `ssh` command is used to securely connect to a remote host.

```sh
# Syntax: ssh [options] [user@hostname]
ssh user@remotehost

# Use a specific port
ssh -p 2222 user@remotehost

# Execute a command on the remote host
ssh user@remotehost 'ls -la'
```

### `scp`

The `scp` command is used to securely copy files between hosts.

```sh
# Syntax: scp [options] [source] [destination]
scp localfile.txt user@remotehost:/path/to/remote/directory

# Copy a file from a remote host to the local machine
scp user@remotehost:/path/to/remotefile.txt /local/directory
```

## Notes

- These commands are specific to Linux operating systems and may not be available on other platforms.
- Some commands may require administrative privileges to execute, so it's recommended to run them using `sudo` or as the root user.