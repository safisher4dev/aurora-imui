package cn.jiguang.imui.messages;


import java.io.File;

public interface CameraSupport {
    CameraSupport open(int cameraId, int width, int height);
    int getOrientation(int cameraId);
    void release();
    void setOutputFile(File file);
}
