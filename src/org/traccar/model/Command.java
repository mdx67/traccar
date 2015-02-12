package org.traccar.model;

/**
 * Command
 * Teste Jenkins 4
 * 
 * @author rguterres
 */
public class Command {
    
    /**
     * Id
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Device Id
     */
    private Long deviceId;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }
    
    /**
     * Command
     */
    private String command;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    } 
}
