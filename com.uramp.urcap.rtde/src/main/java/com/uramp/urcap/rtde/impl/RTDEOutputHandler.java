package com.uramp.urcap.rtde.impl;

public class RTDEOutputHandler {

    public void onConnect() {}

    public void onDisconnect() {}

    public void onProtocolVersion(int protocolVersion) {}

    public void onSetupOutputsResponse(RTDEOutputParam[] supported,
            RTDEOutputParam[] unsupported) {}

    public void onSetupInputsResponse(int id,
            RTDEInputParam[] supported,
            RTDEInputParam[] unsupported) {}


    public void onControlPackageStart() {}

    public void onControlPackagePause() {}

    public void onData(RTDEOutputParam output, RTDEDataType type, Object value) {}

}
