# 3 Selected Use Cases
1. Create a Science Plan
2. Submit a Science Plan
3. Test a Science Plan

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

# 2. Submit a Science Plan

| **Use Case Name** | Submit a Science Plan |
| :--- | :--- |
| **ID** | UC-003 |
| **Importance Level** | High |
| **Primary Actor** | Astronomer |
| **Use Case Type** | Detail / Essential |
| **Stakeholders and Interests** | **Astronomer** – Wants to successfully submit a science plan for execution, ensuring it aligns with observation requirements and constraints. |
| **Precondition** | The astronomer must be signed in before using this case. |
| **Brief Description** | This use case describes how an astronomer submits a science plan. The plan is then validated by a science observer and converted into an observing program for execution. |
| **Trigger** | The astronomer wants to submit a science plan for future observation. |
| **Type** | External |
| **Relationship** | |
| **Association:** | Astronomer |
| **Include:** | - |
| **Extend:** | - |
| **Generalization:** | - |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | The astronomer navigates to the Science Plan Management menu. |
| 2 | The system shows the Science Plans page, displaying all the science plans created by the astronomer. |
| 2.1 | The astronomer can review and filter the list of science plans by their statuses (created, tested, submitted, validated, executed). |
| 3 | The astronomer selects the science plan they want to submit. |
| 4 | The system requests confirmation to submit the science plan. |
| 4.1 | If the astronomer chooses "Confirm," the system submits the selected science plan. |
| 4.2 | If the astronomer selects "Cancel," the system goes back to the page showing the list of submitted science plans (step 2). |

| **SubFlows** | **Description** |
| :--- | :--- |
| S-1 | Astronomer Cancels Submission: The astronomer selects a science plan but decides not to submit it. The page shows the list of submitted science plans (step 2). |

| **Alternate/Exceptional Flows** | **Description** |
| :--- | :--- |
| S-1, 4a1 | If the astronomer has not created any science plans, the system shows a blank page with an option to create a new science plan (go to Create Science Plan use case). (step 2) |
| S-1, 4a2 | The astronomer can only submit a science plan with the status "tested." If the plan is created but not tested, the system tells the astronomer to test the plan first (go to Test a Science Plan use case). (step 3) |

# 3. Test a Science Plan

# Test a Science Plan

| **Use Case Name** | Test a Science Plan |
| :--- | :--- |
| **ID** | UC-002 |
| **Importance Level** | High |
| **Primary Actor** | Astronomer |
| **Use Case Type** | Detail, Essential |
| **Stakeholders and Interests** | **Astronomer** - wants to test a science plan before submission, ensuring the plan is feasible and aligns with observational goals. |
| **Brief Description** | This use case describes how an astronomer evaluates the feasibility of a science plan before submission. This process ensures that the observational parameters, telescope settings, and execution steps are correct and align with system constraints. |
| **Precondition** | The astronomer must have already logged in before testing a science plan. |
| **Trigger** | An astronomer initiates the testing process for a science plan. |
| **Type** | External |
| **Relationship** | |
| **Association:** | Astronomer |
| **Include:** | Operate the interactive observing (virtual telescope) |
| **Extend:** |  |
| **Generalization:** |  |

| **Normal Flow of Events** | **Description** |
| :--- | :--- |
| 1 | The astronomer selects the “Test Science Plan” button. |
| 2 | The system lists all available science plans that can be tested. |
| 3 | The astronomer selects a created science plan from the list. |
| 4 | The system loads the selected plan and prepares it for testing. |
| 5 | The system executes the following test cases to validate the science plan:<br>- **Star System Selection Test**: Ensures the selected star system is appropriate.<br>- **Image Processing Configuration Test**: Verifies settings for image processing including file type, quality, contrast, brightness, and saturation.<br>- **Telescope Location Test**: Confirms the selected telescope aligns with observation requirements.<br>- **Observation Duration Test**: Checks if the observation duration is within acceptable limits. |
| 6 | The system evaluates the test results. |
| 7 | If all test cases pass, the system updates the science plan’s status to "TESTED" and displays a success message with the results. |
| 8 | If any test case fails, the system provides an error message detailing the failed test case(s) and suggests corrections. |
| 9 | The astronomer reviews the results and makes necessary adjustments. |
| 10 | S-1: Review and Finalize the Test Results is performed. |
| 11 | The astronomer updates the status of the tested science plan. |
| 12 | The astronomer completes the process by selecting the “Finish” button. |
| 13 | The system logs the test completion and updates the plan’s record. |

| **SubFlows** | **Description** |
| :--- | :--- |
| S-1 | **Review and Finalize the Test Results**: The Astronomer reviews the summary report and decides whether to modify and retest or go to the “Submit a Science Plan” use case. |

| **Alternate/Exceptional Flows** | **Description** |
| :--- | :--- |
| 2a1 | If no testable science plans are found, the system displays "No available science plans for testing." |
| 3a1 | If the astronomer selects a science plan that does not exist, the system displays "Your selected science plan does not exist." |
| 5a1 | If any of the test cases fail, the system displays the failed test case(s). |


# Activity Diagram
# 1. Create a Science Plan
![D5 cream activity](https://github.com/user-attachments/assets/508a4ee3-a2f2-49c5-87e4-8946d1386eaf)

# 2. Submit a Science Plan
![D5 pin activity drawio](https://github.com/user-attachments/assets/b15fcf39-d744-4cf2-90e5-da1075553a7a)

# 3. Test a Science Plan
![D5 bew activity](https://github.com/user-attachments/assets/55675ac1-ee1e-48ae-8516-9cedb37abb9c)



# Sequence Diagram
# 1. Create a Science Plan
![Gemini6 Seq Diagram-create sci plan drawio](https://github.com/user-attachments/assets/f6042fa3-4b4c-4b87-8527-a4138a6ab313)

# 2. Submit a Science Plan
![D5 pin sequence drawio](https://github.com/user-attachments/assets/f90eb7ec-6d5f-407f-9140-2c97e30d5aa4)

# 3. Test a Science Plan
![D5 bew sequence drawio](https://github.com/user-attachments/assets/8ffdabd7-0ded-48ac-b5d4-204e718a6aec)


# Class Diagram
![Gemini6 Class Diagram-Page-5 drawio](https://github.com/user-attachments/assets/f6ae8ac0-fb3b-4483-afff-b199677620e1)



