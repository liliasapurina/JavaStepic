package robot;

/**
 * Created by lilia on 03.07.17.
 */
public class Main {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int attempts = 0;
        boolean connected = false;
        RobotConnection robotConnection = null;
        while (!connected && (attempts != 3)) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                connected = true;
            } catch (RobotConnectionException e) {
                // do nothing
            } catch (Throwable anotherError) {
                throw anotherError;
            } finally {
                if (robotConnection != null) {
                    try {
                        robotConnection.close();
                    } catch (RobotConnectionException ignore) {
                        // do nothing
                    } finally {
                        attempts++;
                    }
                } else {
                    attempts++;
                }
            }
        }
        if (!connected) {
            throw new RobotConnectionException("Attempts number = 3; Connection refused!");
        }
    }

    public static void main(String[] args) throws Exception {
        //System.out.println(moveRobot())
    }
}
