package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface MusicRecord extends Product {

    String getArtist();

    Duration getPlayingTime();
}
