package com.adityachandel.booklore.model.dto.request;

import com.adityachandel.booklore.model.enums.BookFileType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBookRequest {
    private String fileName;
    private String fileSubPath;
    private BookFileType bookType;
    private Long fileSizeKb;
    private Float metadataMatchScore;
}