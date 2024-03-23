DIP Violation:
This code violates the DIP because the Person class
depends directly on the Car class, making it too 
intertwined with low-level modules.


DIP Solve:
This solves the DIP violation by making the Person
class rely on the car interface rather than the car 
type itself.


OCP Violation:
This code is an OCP because if a new position must be added,
a modification to the position method and it is not
open for proper extension.


OCP Solve:
This code solves the OCP violation by allowing 
ease of extension without need of modification
when adding new positions using the Position interface.
The employee class is closed for modification but allows
extensibility as new positions are added.

ISP Violation:
This is a violation of ISP because it forces users to use
interfaces and functionalities that may not be necessary.
They may not require all three notification methods in every scenario.


ISP Solve:
This solves the violation by effectively splitting the
notification functionalities into the necessary interfaces.
The 'ThisMessagingService' class can implement the individual
interfaces and implementations individually as needed.
