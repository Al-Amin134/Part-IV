STM32F446RE Dual-Board Communication: I2C & UART
Author : Md. Al-Amin Babu
Session : 2020 - 2021
Department of Computer Science and Engineering
University of Rajshahi, Bangladesh

This repository demonstrates how to establish communication between two STM32F446RE Nucleo-64 boards. It covers the implementation of both UART and I2C protocols using the STM32 HAL library.

🟦 1. UART Communication (Point-to-Point)

The UART (Universal Asynchronous Receiver-Transmitter) protocol is used here for asynchronous, full-duplex data exchange. In this setup, we use USART1 for board-to-board communication while keeping USART2 free for PC debugging via the USB cable.

🔌 Hardware Connection
Board A (TX/RX)	Board B (TX/RX)	Description
PA9 (TX)	PA10 (RX)	Transmit data from Board A to Board B
PA10 (RX)	PA9 (TX)	Receive data on Board A from Board B
GND	GND	Common Ground (Mandatory)
⚙️ Configuration (STM32CubeIDE)

Peripheral: USART1

Mode: Asynchronous

Baud Rate: 115200 Bits/s

Word Length: 8 Bits

Stop Bits: 1

Parity: None

📝 Logic Implementation

Transmission: Uses HAL_UART_Transmit() to send command strings.

Reception: Uses HAL_UART_Receive_IT() (Interrupt Mode) to ensure the board can process other tasks while waiting for data.

Workflow: When the Blue User Button is pressed on Board A, a message is sent to Board B, which then toggles an LED upon receipt.

🟧 2. I2C Communication (Master-Slave)

The I2C (Inter-Integrated Circuit) protocol is used for synchronous communication. In this project, Board A acts as the Master and Board B acts as the Slave with a specific 7-bit hardware address.

🔌 Hardware Connection
Board A (Master)	Board B (Slave)	Description
PB8 (SCL)	PB8 (SCL)	Serial Clock line
PB9 (SDA)	PB9 (SDA)	Serial Data line
GND	GND	Common Ground (Mandatory)

Note: Ensure you use jumper wires that are as short as possible. The Nucleo boards have internal pull-up resistors, but for high speeds or longer wires, external 4.7kΩ resistors are recommended.

⚙️ Configuration (STM32CubeIDE)

Peripheral: I2C1

I2C Speed: Standard Mode (100kHz)

Slave Address (Board B): 0x12

Addressing Mode: 7-bit

📝 Logic Implementation

Master (Board A): Uses HAL_I2C_Master_Transmit() to send data packets and HAL_I2C_Master_Receive() to request data from the slave.

Slave (Board B): Uses HAL_I2C_Slave_Receive_IT() to listen for its address (0x12) on the bus.

Workflow: The Master periodically requests sensor data or status updates from the Slave. If the Slave recognizes the address, it sends back a data byte.

🛠 Project Structure

/UART_Implementation: Contains the source code for both boards using USART1.

/I2C_Implementation: Contains the source code for Master and Slave using I2C1.

/Common: Shared headers and peripheral initialization files.

🚀 How to Use

Wiring: Connect the boards as shown in the tables above. Do not forget the GND-to-GND connection.

Setup: Open the projects in STM32CubeIDE.

Flash: Upload the Master/Sender code to the first board and the Slave/Receiver code to the second board.

Debug: Use a Serial Monitor (like Putty or the built-in IDE console) at 115200 baud to see the logs from both boards.
STM32F446RE Nucleo-64 I2C and UART communication project README example
GitHub README markdown template for embedded systems communication protocol project
how to document I2C and UART protocol implementation in GitHub README for STM32
STM32F446RE pinout for I2C1 and USART1/USART2 communication between two boards
