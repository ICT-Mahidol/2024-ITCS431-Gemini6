# 3 Selected Use Cases
1. Create a Science Plan
2. Test a Science Plan
3. Submit a Science Plan

# Updated use case descriptions

# 1. Create Science Plan

| **Use Case Name** | Create Science Plan |
| :--- | :--- |
| **ID** | UC-001 |
| **Importance Level** | High |
| **Primary Actor** | Astronomers |
| **Use Case Type** | Detail, Essential |
| **Stakeholders and Interests** | **Astronomers** - want to create a science plan |
| **Brief Description** | The astronomers logs into the system to create a science plan. |
| **Trigger** | An astronomer initiates creating a new science plan within the system. |
| **Type** | Internal |
| **Relationship** | |
| **Association:** | Astronomer |
| **Include:** | Log in to the System |
| **Extend:** |  |
| **Generalization:** |  |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | An astronomer selects ‘’Create Science Plan” menu item |
| 2 | An Astronomer enters science plan details including:<br>- Plan ID - automatically generated<br>- Plan Name - short plain text<br>- Creator - automatically fill in using the astronomer’s account information<br>- Funding - numerical values in Dollars with decimal points<br>- Objective - long plain text<br>- Start and End dates - select from a calendar<br>- Telescope assigned - a list of two telescopes: Hawaii and Chile<br>- Target – the target is based on the star system selected from a list of star catalog |
| 3 | An Astronomer defines image processing settings, including:<br>- FileType – one of the following options: PNG, JPEG, RAW<br>- FileQuality – one of the following options: Low, Fine<br>- ColorType – one of the following options: Color mode, B&W mode<br>- Contrast – decimal values (for both color and B&W modes)<br>- Brightness – decimal values (only for color mode)<br>- Saturation – decimal values (only for color mode)<br>- Highlights – decimal values (only for B&W mode)<br>- Exposure - decimal values (for both color and B&W modes)<br>- Shadows - decimal values (only for B&W mode)<br>- Whites - decimal values (only for B&W mode)<br>- Blacks - decimal values (only for B&W mode)<br>- Luminance - decimal values (only for color mode)<br>- Hue - decimal values (only for color mode) |
| 4 | An Astronomer saves science plans by adding a science plan to the science plan list. |

| **SubFlows** | |
| :--- | :--- |
|  |  |

| **Alternate/Exceptional Flows** | **Description** |
| :--- | :--- |
| 2a1 | If the astronomer enters invalid data in the science plan details, the system sends an error message. |
| 2a2 | If the selected Schedule has a start date after an end date, the system alerts with a “Start date cannot be after the end date” |
| 3a | If the input data is not compatible with the legacy OCS system (e.g., invalid file format, unsupported field values, or missing required information), the system displays an error message: “Input data is not compatible with the legacy OCS system.” |
| 4a | If the created science plan conflicts with another plan, the system sends an error message to the astronomer. |

