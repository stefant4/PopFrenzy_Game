package com.popfrenzy

import android.annotation.SuppressLint
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Policy : AppCompatActivity() {
    private lateinit var myTextView: TextView

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_policy2)

        // Initialize the TextView
        myTextView = findViewById(R.id.policytextview)

        // Set text for the TextView
        myTextView.text = "- Terms & Conditions -\n" +
                "\n" +
                "\n" +
                "These terms and conditions applies to the Pop Frenzy app (hereby referred to as \"Application\") for mobile devices that was created by Stefan Talica (hereby referred to as \"Service Provider\") as a Free service.\n" +
                "\n" +
                "\n" +
                "Upon downloading or utilizing the Application, you are automatically agreeing to the following terms. It is strongly advised that you thoroughly read and understand these terms prior to using the Application. Unauthorized copying, modification of the Application, any part of the Application, or our trademarks is strictly prohibited. Any attempts to extract the source code of the Application, translate the Application into other languages, or create derivative versions are not permitted. All trademarks, copyrights, database rights, and other intellectual property rights related to the Application remain the property of the Service Provider.\n" +
                "\n" +
                "\n" +
                "The Service Provider is dedicated to ensuring that the Application is as beneficial and efficient as possible. As such, they reserve the right to modify the Application or charge for their services at any time and for any reason. The Service Provider assures you that any charges for the Application or its services will be clearly communicated to you.\n" +
                "\n" +
                "\n" +
                "The Application stores and processes personal data that you have provided to the Service Provider in order to provide the Service. It is your responsibility to maintain the security of your phone and access to the Application. The Service Provider strongly advise against jailbreaking or rooting your phone, which involves removing software restrictions and limitations imposed by the official operating system of your device. Such actions could expose your phone to malware, viruses, malicious programs, compromise your phone's security features, and may result in the Application not functioning correctly or at all.\n" +
                "\n" +
                "Please note that the Application utilizes third-party services that have their own Terms and Conditions. Below are the links to the Terms and Conditions of the third-party service providers used by the Application:\n" +
                "\n" +
                "Google Play Services\n" +
                "\n" +
                "Please be aware that the Service Provider does not assume responsibility for certain aspects. Some functions of the Application require an active internet connection, which can be Wi-Fi or provided by your mobile network provider. The Service Provider cannot be held responsible if the Application does not function at full capacity due to lack of access to Wi-Fi or if you have exhausted your data allowance.\n" +
                "\n" +
                "\n" +
                "If you are using the application outside of a Wi-Fi area, please be aware that your mobile network provider's agreement terms still apply. Consequently, you may incur charges from your mobile provider for data usage during the connection to the application, or other third-party charges. By using the application, you accept responsibility for any such charges, including roaming data charges if you use the application outside of your home territory (i.e., region or country) without disabling data roaming. If you are not the bill payer for the device on which you are using the application, they assume that you have obtained permission from the bill payer.\n" +
                "\n" +
                "\n" +
                "Similarly, the Service Provider cannot always assume responsibility for your usage of the application. For instance, it is your responsibility to ensure that your device remains charged. If your device runs out of battery and you are unable to access the Service, the Service Provider cannot be held responsible.\n" +
                "\n" +
                "\n" +
                "In terms of the Service Provider's responsibility for your use of the application, it is important to note that while they strive to ensure that it is updated and accurate at all times, they do rely on third parties to provide information to them so that they can make it available to you. The Service Provider accepts no liability for any loss, direct or indirect, that you experience as a result of relying entirely on this functionality of the application.\n" +
                "\n" +
                "\n" +
                "The Service Provider may wish to update the application at some point. The application is currently available as per the requirements for the operating system (and for any additional systems they decide to extend the availability of the application to) may change, and you will need to download the updates if you want to continue using the application. The Service Provider does not guarantee that it will always update the application so that it is relevant to you and/or compatible with the particular operating system version installed on your device. However, you agree to always accept updates to the application when offered to you. The Service Provider may also wish to cease providing the application and may terminate its use at any time without providing termination notice to you. Unless they inform you otherwise, upon any termination, (a) the rights and licenses granted to you in these terms will end; (b) you must cease using the application, and (if necessary) delete it from your device.\n" +
                "\n" +
                "\n" +
                "Changes to These Terms and Conditions\n" +
                "The Service Provider may periodically update their Terms and Conditions. Therefore, you are advised to review this page regularly for any changes. The Service Provider will notify you of any changes by posting the new Terms and Conditions on this page.\n" +
                "\n" +
                "\n" +
                "These terms and conditions are effective as of 2024-07-23\n" +
                "\n" +
                "\n" +
                "Contact Us\n" +
                "If you have any questions or suggestions about the Terms and Conditions, please do not hesitate to contact the Service Provider at talicastefan70@gmail.com.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Privacy Policy  -\n" +
                "\n" +
                "\n" +
                "This privacy policy applies to the Pop Frenzy app (hereby referred to as \"Application\") for mobile devices that was created by Stefan Talica (hereby referred to as \"Service Provider\") as a Free service. This service is intended for use \"AS IS\".\n" +
                "\n" +
                "\n" +
                "What information does the Application obtain and how is it used?\n" +
                "The Application does not obtain any information when you download and use it. Registration is not required to use the Application.\n" +
                "\n" +
                "\n" +
                "Does the Application collect precise real time location information of the device?\n" +
                "This Application does not collect precise information about the location of your mobile device.\n" +
                "\n" +
                "\n" +
                "Do third parties see and/or have access to information obtained by the Application?\n" +
                "Since the Application does not collect any information, no data is shared with third parties.\n" +
                "\n" +
                "\n" +
                "What are my opt-out rights?\n" +
                "You can stop all collection of information by the Application easily by uninstalling it. You may use the standard uninstall processes as may be available as part of your mobile device or via the mobile application marketplace or network.\n" +
                "\n" +
                "\n" +
                "Children\n" +
                "The Application is not used to knowingly solicit data from or market to children under the age of 13.\n" +
                "\n" +
                "\n" +
                "The Service Provider does not knowingly collect personally identifiable information from children. The Service Provider encourages all children to never submit any personally identifiable information through the Application and/or Services. The Service Provider encourage parents and legal guardians to monitor their children's Internet usage and to help enforce this Policy by instructing their children never to provide personally identifiable information through the Application and/or Services without their permission. If you have reason to believe that a child has provided personally identifiable information to the Service Provider through the Application and/or Services, please contact the Service Provider (talicastefan70@gmail.com) so that they will be able to take the necessary actions. You must also be at least 16 years of age to consent to the processing of your personally identifiable information in your country (in some countries we may allow your parent or guardian to do so on your behalf).\n" +
                "\n" +
                "\n" +
                "Security\n" +
                "The Service Provider is concerned about safeguarding the confidentiality of your information. However, since the Application does not collect any information, there is no risk of your data being accessed by unauthorized individuals.\n" +
                "\n" +
                "\n" +
                "Changes\n" +
                "This Privacy Policy may be updated from time to time for any reason. The Service Provider will notify you of any changes to their Privacy Policy by updating this page with the new Privacy Policy. You are advised to consult this Privacy Policy regularly for any changes, as continued use is deemed approval of all changes.\n" +
                "\n" +
                "\n" +
                "This privacy policy is effective as of 2024-07-23\n" +
                "\n" +
                "\n" +
                "Your Consent\n" +
                "By using the Application, you are consenting to the processing of your information as set forth in this Privacy Policy now and as amended by the Service Provider.\n" +
                "\n" +
                "\n" +
                "Contact Us\n" +
                "If you have any questions regarding privacy while using the Application, or have questions about the practices, please contact the Service Provider via email at talicastefan70@gmail.com."



    }
}