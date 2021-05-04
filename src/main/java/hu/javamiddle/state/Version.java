package hu.javamiddle.state;

public class Version {

    private int major; // Publish
    private int minor; // Edit

    public Version(int major, int minor) {
        this.major = major;
        this.minor = minor;
    }

    public void nextMajor() {
        major++;
        minor = 0;
    }

    public void nextMinor() {
        minor++;
    }

    @Override
    public String toString() {
        return major + "." + minor;
    }
}
