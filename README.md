# virtual-CAT-data-infrastructure

### Citation
[![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.10015011.svg)](https://doi.org/10.5281/zenodo.10015011)

If you use the materials provided in this repository, please cite the following work:

```bibtex
   @misc{adorni_virtualCATdatainfrastructure_2023,
     author = {Adorni, Giorgia and Karpenko, Volodymyr},
     doi = {10.5281/zenodo.10015011},
     month = oct,
     title = {{virtual CAT data infrastructure}},
     note = {Zenodo Software. \url{https://doi.org/10.5281/zenodo.10015011}},
     year = {2023}
   }
```

### Overview 
This repository contains the data infrastructure for the virtual Cross Array Task (CAT) platform. It provides instructions and scripts for setting up the data handling and storage system for the virtual CAT application.

#### Requirements

- [Gradle](https://gradle.org/): Ensure you have Gradle installed on your macOS system. You can install it using Homebrew with the following command:
  ```shell
  brew install gradle

#### Setting Up WiFi Sharing (One-time Setup)
To enable WiFi sharing on your macOS system, follow these steps:

1. Create a Loopback network service:
   ```shell
   sudo networksetup -createnetworkservice Loopback lo0
   sudo networksetup -setmanual Loopback 127.0.0.1 255.255.255.255

2. Create a WiFiSharing network service:
   ```shell
   sudo networksetup -createnetworkservice WifiSharing lo0
   sudo networksetup -setmanual WifiSharing 172.20.42.42 255.255.255.255
   
#### Usage
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



##### REFERENCES

**[1]** A. Piatti, G. Adorni, L. El-Hamamsy, L. Negrini, D. Assaf, L. Gambardella & F. Mondada. (2022). The CT-cube: A framework for the design and the assessment of computational thinking activities. Computers in Human Behavior Reports, 5, 100166. https://doi.org/10.1016/j.chbr.2021.100166

**[2]** Adorni, G. (2023). Dataset from the pilot study of the virtual CAT platform for algorithmic thinking skills assessment in Swiss Compulsory Education. Zenodo Dataset. https://doi.org/10.5281/zenodo.10018292

**[3]** Adorni, G., & Piatti, S., & Karpenko, V. (2023). virtual CAT: An app for algorithmic thinking assessment within Swiss compulsory education. Zenodo Software. https://doi.org/10.5281/zenodo.10027851
On GitHub: https://github.com/GiorgiaAuroraAdorni/virtual-CAT-app/

**[4]** Adorni, G., & Karpenko, V. (2023). virtual CAT programming language interpreter. Zenodo Software. https://doi.org/10.5281/zenodo.10016535 
On GitHub: https://github.com/GiorgiaAuroraAdorni/virtual-CAT-programming-language-interpreter/
