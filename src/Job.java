public class Job {
    String id;
    String jobAddress;
    String idJobPosition;
    String jobPosition;

    public Job() {
    }

    public Job(String id, String jobAddress, String idJobPosition, String jobPosition) {
        this.id = id;
        this.jobAddress = jobAddress;
        this.idJobPosition = idJobPosition;
        this.jobPosition = jobPosition;
    }

    public String getIdJobPosition() {
        return idJobPosition;
    }

    public void setIdJobPosition(String idJobPosition) {
        this.idJobPosition = idJobPosition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

}
