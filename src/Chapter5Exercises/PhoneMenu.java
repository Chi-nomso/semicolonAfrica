package Chapter5Exercises;

import java.util.Scanner;

public class PhoneMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userOption;

        String Prompt = """
                Welcome to Nokia
                press 1-Phonebook
                press 2-Messages
                press 3-Chat
                press 4-Call Register
                press 5-Tones
                press 6-Settings
                press 7-Call Divert
                press 8-Games
                press 9-Calculator
                press 10-Reminder
                press 11-Clock
                press 12-Profile
                press 13-Sim Services                
                """;
        System.out.println(Prompt);
            userOption = input.nextInt();
            switch (userOption){
                case 1:
                    String Phonebook = """
                        1-search
                        2-service number
                        3-Add name
                        4-Erase
                        5-Edit
                        6-Assign tone
                        7-Send b'Card
                        8-Options
                        9-Speed Dials
                        10-Voice Tags             
                        """;
                            System.out.println(Phonebook);
                    userOption = input.nextInt();
                            switch (userOption){
                                case 8:
                                    String options = """
                                            1- Type of view
                                            2- Memory Status
                                            """;
                                    System.out.println(options);
                            }
                                break;
                case 2:
                    String Messages = """
                            1- Write Message
                            2- Inbox
                            3- Outbox
                            4- Picture Messages
                            5- Template
                            6- Smileys
                            7- Message settings
                            8- info service
                            9- Voicemail box
                            10- Service command editor
                            """;
                    System.out.println(Messages);
                    userOption = input.nextInt();
                    switch (userOption){
                        case 7:
                            String Message = """
                                    1- Set
                                    2- Common
                                    """;
                            System.out.println(Message);
                            userOption = input.nextInt();
                            switch (userOption){
                                case 1:
                                    String set = """
                                            1- Message center number
                                            2- Message sent as
                                            3- Message Validity
                                            """;
                                    System.out.println(set);
                            }
//                            userOption = input.nextInt();
                            switch (userOption){
                                case 2:
                                    String Common = """
                                            1- Delivery report
                                            2- reply  via same center
                                            3- character support
                                            """;
                                    System.out.println(Common);
                            }
                    }
                    break;
                case 3:
                    System.out.println("Chat");
                    break;
                case 4:
                    String Register = """
                            1- Missed Calls
                            2- Received calls
                            3- Dialled number
                            4- Erase Recent call list
                            5- Show call duration
                            6- Show call cost
                            7- Call cost setting
                            8- Prepaid Credit
                            """;
                    System.out.println(Register);
                    userOption = input.nextInt();
                    switch (userOption){
                        case 5:
                            String Duration = """
                                    1- Last call duration
                                    2- All call duration
                                    3- received call duration
                                    4- dialled called duration
                                    5- clear timers
                                    """;
                            System.out.println(Duration);
                    }
                    switch (userOption){
                        case 6:
                            String CallCost = """
                                    1- Last call cost
                                    2- All call cost
                                    3- Clear counters
                                    """;
                            System.out.println(CallCost);
                    }
                    switch (userOption){
                        case 7:
                            String CallCostSetting = """
                                    1- call cost limits
                                    2- show costs in.
                                    """;
                            System.out.println(CallCostSetting);
                    }
                    break;
                case 5:
                    String Tone = """
                            1- Ring tone
                            2- Ring volume
                            3- Incoming call alert
                            4- Composer
                            5- Message alert tones
                            6- Keypad tune
                            7- Warning and game tune
                            8- Vibrating Alert
                            9- Screen Saver
                            """;
                    System.out.println(Tone);
                    break;
                case 6:
                    String Settings = """
                            1- Call Setting
                            2- Phone settings
                            3- Security settings
                            4- Restore factory settings
                            """;
                    System.out.println(Settings);
                    userOption = input.nextInt();
                    switch (userOption){
                        case 1:
                            String CallSetting = """
                                    1- Automatic redial
                                    2- Speed dialing
                                    3- Call waiting options
                                    4- own number sending
                                    5- Phone line in use
                                    6- Automatic answer
                                    """;
                            System.out.println(CallSetting);
                    }
                    switch (userOption){
                        case 2:
                            String PhoneSetting = """
                                    1- Language
                                    2- Cell phone info
                                    3- welcome note
                                    4- network selection
                                    5- Lights
                                    6- confirm sim service actionByKicking
                                    """;
                            System.out.println(PhoneSetting);
                    }
                    switch (userOption){
                        case 3:
                            String SecuritySetting = """
                                    1- pin code request
                                    2- call barring service
                                    3- fixed dialing 
                                    4- closed user group
                                    5- phone security
                                    6- change access code
                                    """;
                            System.out.println(SecuritySetting);
                    }
                    
                    break;
                case 7:
                    System.out.println("Call Divert");
                    break;
                case 8:
                    System.out.println("Games");
                    break;
                case 9:
                        System.out.println("Calculator");
                        break;
                case 10:
                    System.out.println("Reminders");
                    break;
                case 11:
                    String Clocks = """
                            1- Alarm Clock
                            2- Clock settings
                            3- Date settings
                            4- Stop watch
                            5- Countdown Timer
                            6- Auto Update of date and time
                            """;
                    System.out.println(Clocks);
                    break;
                case 12:
                    System.out.println("Profile");
                    break;
                case 13:
                    System.out.println("SIM Service");
                    break;


            }
    }
}

