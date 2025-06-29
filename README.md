
# File Encryption & Decryption GUI in Java

This Java application provides a simple GUI-based tool to encrypt or decrypt any file (such as an image) using XOR-based byte-level operations. The user inputs a numeric key, selects a file, and the application performs reversible encryption by applying an XOR operation on each byte of the file. The same key can be used again to restore the original file.

It uses Swing for the user interface, AWT for layout management, and Java I/O for file manipulation.
✨ Features
🖱️ Simple GUI using Java Swing

🧩 XOR-based encryption and decryption using a numeric key

📁 File chooser to easily select any file from your system

🔐 Reversible file manipulation — encrypted files can be restored with the same key

📤 Directly modifies the selected file

💬 Confirmation messages shown via popups

🎯 Center-aligned GUI with clean layout and custom font
## 🚀 About Me
I am a passionate developer and dedicated student from India with a strong academic background, having achieved distinction in my Bachelor's degree in Computer Science. I am eager to contribute meaningfully to society through technology and innovation, with a focus on building solutions that shape a better tomorrow.

## Roadmap
🖥️ 1. GUI Setup
 - Built the main application window using JFrame

 - Added components: JButton and JTextField

 - Applied layout using FlowLayout

 - Customized font using Font class

 - Centered the window and handled close operation

📁 2. File Handling
 - Integrated JFileChooser for selecting files

 - Used FileInputStream to read file bytes

 - Used FileOutputStream to write modified bytes

 - Handled file read/write exceptions gracefully

🔐 3. Encryption Logic
 - Accepted user input for encryption key

 - Performed XOR operation on file bytes using the input key

 - Ensured reversible encryption (same key decrypts)

 - Displayed success message using JOptionPane
## Environment Variables

✅ System Requirements
- Java JDK 8 or above installed

- JAVA_HOME environment variable properly configured

- An IDE (like IntelliJ IDEA, Eclipse, or VS Code with Java extensions) or terminal with javac and java access

🔧 Optional Setup
- If running via command line:

- Ensure the directory of your .java file is accessible

- Compile and run using:

  - `javac ImageOperation.java`
  - `java ImageOperation`
## 🚀 Possible Future Enhancements

🧭 Encrypt to New File: Instead of overwriting the original file, save the encrypted output as a separate file.

🔐 Separate Encrypt & Decrypt Buttons: Add dedicated buttons for each action to improve clarity.

🎨 Improved UI Design: Use layout managers like GridBagLayout or external UI frameworks for a more modern look.

📂 Support for Drag-and-Drop file selection.

⚠️ Input Validation: Warn users about empty or invalid keys (e.g., letters, zero, or negatives).

📊 Progress Indicator: Show a loading bar or spinner while encryption is happening.

🛡️ Key Strength Checks: Add suggestions or warnings based on key strength.

📁 Multi-file Support: Allow batch encryption of multiple files at once.

🧪 Cross-platform Testing: Ensure GUI and file handling work consistently across Windows, Linux, and macOS.

📜 Logging System: Add logging to track operations, errors, and timestamps.

