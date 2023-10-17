# virtual-CAT-data-infrastructure

[![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.10015012.svg)](https://doi.org/10.5281/zenodo.10015012)

This repository contains the data infrastructure for the virtual Cross Array Task (CAT) platform. It provides instructions and scripts for setting up the data handling and storage system for the virtual CAT application.

## Requirements

- [Gradle](https://gradle.org/): Ensure you have Gradle installed on your macOS system. You can install it using Homebrew with the following command:
  ```shell
  brew install gradle

## Setting Up WiFi Sharing (One-time Setup)
To enable WiFi sharing on your macOS system, follow these steps:

1. Create a Loopback network service:
   ```shell
   sudo networksetup -createnetworkservice Loopback lo0
   sudo networksetup -setmanual Loopback 127.0.0.1 255.255.255.255

2. Create a WiFiSharing network service:
   ```shell
   sudo networksetup -createnetworkservice WifiSharing lo0
   sudo networksetup -setmanual WifiSharing 172.20.42.42 255.255.255.255
   
## Usage
Follow these steps to set up and run the virtual CAT data infrastructure:

1. Clone this repository and navigate to the project folder:
   ```shell
   git clone https://github.com/GiorgiaAuroraAdorni/virtual-CAT-data-infrastructure.git
   cd virtual-CAT-data-infrastructure

2. Install Gradle if not already installed (as mentioned in the requirements).

3. Start the application using Gradle (ensure you have internet access for the first execution):
   ```shell
   gradle bootRun

4. Activate WiFi Sharing on your macOS system:
   - Go to System Preferences > Sharing.
   - In the left panel, select "Internet Sharing."
   - In the right panel, select "Wi-Fi" for the Share your connection from dropdown.
   - In the "To computers using" list, check "WifiSharing."
   - Click on "Wi-Fi Options," create a network (e.g., "virtualCAT"), set a password, and click "Done."
   - Enable Internet Sharing by checking the box next to "Internet Sharing."

5. If Gradle bootRun is not active, you can access the H2 database console at: http://127.0.0.1:8082/.  
Use the following JDBC URL: jdbc:h2:~/demodb.  
Enter the appropriate username and password.

## Contributing
If you would like to contribute to this project, please fork the repository and create a pull request with your changes.

## License
This project is licensed under the Creative Commons Attribution 4.0 International License.


