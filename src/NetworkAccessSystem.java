import java.util.Scanner;
public class NetworkAccessSystem {
    public static void networkDiagnostics() {
        System.out.println("""
            ================================================================================
                                    NETWORK DIAGNOSTICS & HEALTH REPORT                     
            ================================================================================
            [ACTIVE REACHABILITY - PING (Target: 1.1.1.1)]
              Packets             : 5 Sent, 5 Received, 0% Loss
              Round-Trip Time     : Min 4.12 ms | Avg 4.48 ms | Max 5.03 ms | Jitter 0.31 ms

            [PATH TRACE - MTR / TRACEROUTE (Target: 1.1.1.1)]
              Hop 1  : 10.24.10.1        (gw-core-01.local)       0.62 ms   0.0% Loss
              Hop 2  : 172.16.40.2       (isp-edge-lon02.net)     2.15 ms   0.0% Loss
              Hop 3  : 195.66.224.128    (linx-lon1-ixp.net)      3.89 ms   0.0% Loss
              Hop 4  : 1.1.1.1           (one.one.one.one)        4.48 ms   0.0% Loss

            [DNS & SERVICE CHECKS]
              DNS Resolver (1.1.1.1)   : OK (Query: api.example.net -> 12 ms, DNSSEC: VALID)
              Port 443 (HTTPS)         : OPEN (TLS 1.3 | Cert Expires in 214 days)
              Port 22  (SSH)           : FILTERED
              Port 161 (SNMP)          : OPEN

            [INTERFACE COUNTERS - eth0]
              RX Traffic               : 1.48 TB  (1,142,890,112 pkts | 0 drops | 0 CRC errors)
              TX Traffic               : 912.4 GB (  784,120,450 pkts | 0 drops | 0 collisions)
              SFP Optical Rx/Tx Power  : -2.14 dBm / -1.85 dBm (Temp: 38.4 C - NORMAL)

            [COLLECTOR & AGENT STATUS]
              SNMP Poller              : HEALTHY (42/42 hosts polled in 1.18s)
              IPFIX Flow Collector     : HEALTHY (14,250 flows/sec | Queue: 0%)
            ================================================================================
            """);
    }
    public static void userManagement() {
        System.out.println("""
            ================================================================================
                                    REGISTERED DASHBOARD USER ACCOUNTS                      
            ================================================================================
              ID    | USERNAME    | FULL NAME        | ROLE          | STATUS   | 2FA       
            --------------------------------------------------------------------------------
              1001  | a.patel     | Aarav Patel      | SUPER_ADMIN   | ACTIVE   | ENABLED   
              1002  | c.fletcher  | Chloe Fletcher   | NOC_ENGINEER  | ACTIVE   | ENABLED   
              1003  | m.kowalski  | Mateusz Kowalski | SEC_AUDITOR   | ACTIVE   | ENABLED   
              1004  | s.okafor    | Simi Okafor      | READ_ONLY     | ACTIVE   | DISABLED  
              1005  | d.brennan   | Declan Brennan   | NOC_ENGINEER  | LOCKED   | ENABLED   
            --------------------------------------------------------------------------------
              Total Users: 5  |  Active: 4  |  Locked/Inactive: 1
            ================================================================================
            """);
    }
    public static void securityAdministration() {
        System.out.println("""
            ============================================================
                     NETWORK INTERFACE & DASHBOARD CONFIGURATION        
            ============================================================
            [INTERFACE SETTINGS]
              Interface Name      : eth0 (Primary Uplink)
              MAC Address         : 00:1A:2B:3C:4D:5E
              Link Status         : UP (10000Mb/s Full-Duplex, MTU 1500)
              IPv4 Mode           : Static
              IPv4 Address        : 10.24.10.15 / 24
              Default Gateway     : 10.24.10.1
              IPv6 Address        : fd00:24:10::15 / 64
              Primary DNS         : 1.1.1.1
              Secondary DNS       : 9.9.9.9
              NTP Server          : ://cloudflare.com (Synced)

            [TELEMETRY & POLLING]
              SNMP Version        : v3 (authPriv - SHA-256 / AES-128)
              Polling Interval    : 10s
              Flow Export         : IPFIX -> 10.24.99.50:2055 (Enabled)
              Syslog Target       : udp://10.24.99.51:514 (Level: INFO)

            [DISPLAY & ALERTS]
              Throughput Unit     : Gbps (Bits per second)
              Time Zone           : UTC
              Bandwidth Warning   : 75% (7.50 Gbps)
              Bandwidth Critical  : 90% (9.00 Gbps)
              Packet Loss Alert   : > 1.5% over 60s
              Maintenance Snooze  : OFF
            ============================================================
            """);
    }
    public static void configSettings() {
        System.out.println("""
            ================================================================================
                                 DASHBOARD & SYSTEM CONFIGURATION SETTINGS                  
            ================================================================================
            [DATA SOURCES & POLLING]
              SNMP Collector           : ENABLED (v3 authPriv | Poll Interval: 10s)
              NetFlow / IPFIX Listener : UDP 2055 (Active | Sampling Rate: 1:100)
              Syslog Ingestion         : UDP/TCP 514 (Min Severity: WARNING)
              Discovery Subnets        : 10.24.10.0/24, 10.24.20.0/24, 172.16.40.0/24
              Data Retention           : 30 Days (Raw) | 365 Days (1-Hour Rollups)

            [DISPLAY & UI PREFERENCES]
              Throughput Units         : Gbps (Bits per second - Base 1000)
              Default Time Window      : Last 6 Hours (Auto-Refresh: 15s)
              Time Zone                : UTC (Europe/London)
              Theme & Density          : Dark Mode | Compact Table View

            [ALERT THRESHOLDS & NOTIFICATIONS]
              Link Down / Flap Alert   : IMMEDIATE (Trigger after 2 state changes / 60s)
              Bandwidth Warning / Crit : 75% Warning | 90% Critical
              Latency / Packet Loss    : > 45.0 ms RTT | > 1.5% Loss
              Notification Channels    : Webhook (Slack #net-alerts), Email (noc@example.net)
              Maintenance Snooze       : INACTIVE

            [SECURITY & BACKUP]
              Session Timeout          : 30 Minutes (Enforce 2FA for Admins: TRUE)
              Config Auto-Backup       : Daily at 02:00 UTC -> /var/backups/netdash/
              Last Config Export       : 2026-11-20 02:00:04 UTC (v1.4.2-prod.json)
            ================================================================================
            """);
    }

    public static void main(String[] args) {

        String adminUser = "Admin";
        String techUser = "Technician";
        String guestUser = "Guest";

        String adminPass = "4DM1NP4SSW0RD";
        String techPass = "73CHP4SS";
        String guestPass = "GU3S7W0RD";

        String userName;
        String userPass;
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("      NETWORK ACCESS CONTROL SYSTEM");
        System.out.println("========================================");

        System.out.println("Welcome to the system!");
        System.out.print("Please enter your username: ");
        userName = scanner.nextLine();

        System.out.print("Please enter your password: ");
        userPass = scanner.nextLine();

        if (userName.equalsIgnoreCase(adminUser)) {
            if (userPass.equals(adminPass)) {
                System.out.println("Access granted. \n---Welcome, Administrator---.");
            } else {
                System.out.println("Access denied. Incorrect password entered.");
            }
        } else {
            System.out.println("Access denied. Incorrect username entered.");
        }
        if (userName.equalsIgnoreCase(techUser)) {
            if (userPass.equals(techPass)) {
                System.out.println("Access granted. \n---Welcome, Technician.---.");
            } else {
                System.out.println("Access denied. Incorrect password entered.");
            }
        } else {
            System.out.println("Access denied. Incorrect username entered.");
        }
        if (userName.equalsIgnoreCase(guestUser)) {
            if (userPass.equals(guestPass)) {
                System.out.println("Access granted. \n---Welcome, Guest---.");
            } else {
                System.out.println("Access denied. Incorrect password entered.");
            }
        } else {
            System.out.println("Access denied. Incorrect username entered.");
        }
    }
}