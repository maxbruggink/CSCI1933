Project 4 Discrete Bus Simulation
By Emery Morua (morua007@umn.edu) & Max Bruggink (brugg123@umn.edu)
Instructions for running project:

javac BusSim.java is class that has our main method with the agenda that
everything runs off of.

An Overview of project organization and hierarchy:

The center of the project is the BusSim class that is where we schedule all of
the inital riderEvents & all of the busEvents

The RiderEvent & BusEvent class would be below on the hierarchy. The bus
event class handles passengers getting on and off the busStops by checking if
a certain passenger wants to leave the bus then letting them leave the bus
and adding riders at the respective stop Q. The rider event class schedules
riders to arrive at randomly distributed stops and random time intervals.
This is how we would adjust the peak times where we would adjust the time to
divide it by where our low load we wouldn't divide it by anything, medium load
divide by 1.5 and high load is 2.5.

The bus and rider class they setup each rider and bus. This is setup by
creating relevant events things such as increasing the stops that they should
go to and other important information.

Statistics class where we determine all relevant Statistics that would be
important.



The data structures and algorithms used in project:
Data structures- We used the data structures of Queue in order to store the
passengers that are generated and remove them easily. Another data structure
that we used was a priority queue by scheduling events that will take place
later in the future at their correct location.

Any known bugs or issues associated with the project:

Average bus time not computed correctly/couldn't figure out how to effectively
work it

Express buses- We think that we didn't handle express buses correctly because
when a passenger gets on an express bus and they aren't going to a stop that
the express bus services they will just get stuck infitely on the bus. Thus
this may be why our average time on bus was not correct/broke.
