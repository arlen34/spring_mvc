package peaksoft.serviceImple.service;

import peaksoft.entity.Video;

import java.util.List;

public interface VideoService {
    void saveVideo(int lessId, Video video);

    void updateVideo(int id,Video video);

    Video getVideoById(int id);

    List<Video> getAllVideos(int id);

    void deleteVideoById(int id);
}
