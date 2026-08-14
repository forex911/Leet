// Last updated: 8/14/2026, 10:44:41 AM
class Solution {
    public double angleClock(int hour, int minutes) {
       double minuteAngle=6.0*minutes;
       double hourAngle=30.0*(hour%12)+0.5*minutes;
       double diff = Math.abs(hourAngle - minuteAngle);

    return Math.min(diff, 360.0 - diff);
    }
}