/*
You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
*/

public int caughtSpeeding(int speed, boolean isBirthday) {
  int leeway = isBirthday ? 5 : 0;
  if(speed <= 60 + leeway) return 0;
  if(speed >= 61 && speed <= 80 + leeway) return 1;
  if(speed >= 81 + leeway) return 2;
  return 0;
}