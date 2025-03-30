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
| **Brief Description** | The astronomers log into the system to create a science plan. |
| **Trigger** | An astronomer initiates creating a new science plan within the system. |
| **Type** | Internal |
| **Relationship** | |
| **Association:** | Astronomer |
| **Include:** | Log in to the System |
| **Extend:** |  |
| **Generalization:** |  |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | An astronomer selects "Create Science Plan" menu item. |
| 2 | An astronomer enters science plan details including:<br> - Plan ID (auto-generated)<br> - Plan Name (short plain text)<br> - Creator (auto-filled from account)<br> - Funding (numerical in Dollars)<br> - Objective (long plain text)<br> - Start and End Dates (calendar)<br> - Telescope (Hawaii or Chile)<br> - Target (selected from star catalog) |
| 3 | An astronomer defines image processing settings:<br> - FileType: PNG, JPEG, RAW<br> - FileQuality: Low, Fine<br> - ColorType: Color mode, B&W mode<br> - Contrast: decimal<br> - Brightness, Saturation, Luminance, Hue (Color only)<br> - Highlights, Exposure, Shadows, Whites, Blacks (B&W only)<br> - Exposure, Contrast (both modes) |
| 4 | An astronomer saves the science plan by adding it to the science plan list. |

| **SubFlows** | **Description** |
| :--- | :--- |
| - | None specified |

| **Alternate/Exceptional Flows** | **Description** |
| :--- | :--- |
| 2a1 | If the astronomer enters invalid data in the science plan details, the system sends an error message. |
| 2a2 | If the selected Schedule has a start date after an end date, the system alerts: “Start date cannot be after the end date.” |
| 3a | If the input data is not compatible with the legacy OCS system (e.g., invalid file format, unsupported field values, or missing required information), the system displays an error: “Input data is not compatible with the legacy OCS system.” |
| 4a | If the created science plan conflicts with another plan, the system sends an error message to the astronomer. |



