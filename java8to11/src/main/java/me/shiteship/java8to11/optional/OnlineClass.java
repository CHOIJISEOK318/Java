package me.shiteship.java8to11.optional;

import java.util.IllformedLocaleException;
import java.util.Optional;
import java.util.function.Consumer;

public class OnlineClass {

    private Integer id;

    private String title;

    private boolean closed;

    public Progress progress;

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Optional<Progress> getProgress() {
//        if(this.progress == null){
//            throw new IllformedLocaleException();
//        }
//        return Optional.empty();
        return Optional.ofNullable(progress);
    }

    // 파라미터에 옵셔널을 넣으면 널체크 한번더해야됨
    public void setProgress(Optional<Progress> progress) {
        if(progress != null) {
            progress.ifPresent(p -> this.progress = p);
        }
    }



}
