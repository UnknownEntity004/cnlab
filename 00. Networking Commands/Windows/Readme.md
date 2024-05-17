# Windows Networking Commands

This document provides an overview of networking commands that are specific to the Windows operating system. These commands can be used in the Command Prompt (cmd) or PowerShell to perform various network-related tasks.

## Commands Overview

### `ipconfig`

The `ipconfig` command is used to display network configuration information for all network interfaces on the system.

```sh
# Display IP configuration
ipconfig

# Display detailed IP configuration
ipconfig /all

# Release the IP address for a specific interface
ipconfig /release <interface>

# Renew the IP address for a specific interface
ipconfig /renew <interface>
```

### `ping`

The `ping` command is used to test the connectivity between the local host and a remote host by sending ICMP echo request packets.

```sh
# Syntax: ping [options] destination
ping google.com

# Send a specified number of ping requests
ping -n 4 google.com
```

### `tracert`

The `tracert` command is used to trace the route that packets take to reach a destination host.

```sh
# Syntax: tracert [options] destination
tracert google.com
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
netstat -an | find "LISTENING"
```

### `arp`

The `arp` command is used to display and modify the Address Resolution Protocol (ARP) cache.

```sh
# Display the ARP cache
arp -a

# Flush the ARP cache
arp -d
```

### `route`

The `route` command is used to display and modify the IP routing table.

```sh
# Display the routing table
route print

# Add a static route
route add 192.168.1.0 mask 255.255.255.0 192.168.0.1
```

### `netsh`

The `netsh` command is a scripting utility used to display and modify network settings.

```sh
# Show network interfaces
netsh interface show interface

# Show firewall settings
netsh advfirewall show allprofiles

# Reset TCP/IP stack
netsh int ip reset
```

### `net`

The `net` command is used to display or manage network resources.

```sh
# Display shares on a remote computer
net view \\hostname

# Map a network drive
net use Z: \\server\share

# Display information about users and groups
net user
```

### `telnet`

The `telnet` command is used to communicate with another host using the TELNET protocol.

```sh
# Connect to a remote host on a specified port
telnet remotehost 23
```

## Notes

- These commands are specific to the Windows operating system and may not be available on other platforms.
- Some commands may require administrative privileges to execute, so it's recommended to run them from an elevated Command Prompt or PowerShell.