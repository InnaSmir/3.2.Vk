package ru.netology.domain;

import java.util.Date;

public class Post {
    private int id;
    private int userId; // хозяин поста, кто его разместил
    private String text;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private Date postDate;
    private ViewsInfo viewsInfo;
    private String attachmentsLink; // ссылка на источник поста
    private boolean isFavorite;
    private int fromId;
    private String copyright;
    private String postType;
    private GeoInfo geoInfo;
    private boolean canDelete;
    private boolean canEdit;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {

        this.userId = userId;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public CommentsInfo getCommentsInfo() {

        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {

        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {

        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {

        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {

        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {

        this.repostsInfo = repostsInfo;
    }

    public Date getPostDate() {

        return postDate;
    }

    public void setPostDate(Date postDate) {

        this.postDate = postDate;
    }

    public ViewsInfo getViewsInfo() {

        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {

        this.viewsInfo = viewsInfo;
    }

    public String getAttachmentsLink() {

        return attachmentsLink;
    }

    public void setAttachmentsLink(String attachmentsLink) {

        this.attachmentsLink = attachmentsLink;
    }

    public boolean isFavorite() {

        return isFavorite;
    }

    public void setFavorite(boolean favorite) {

        isFavorite = favorite;
    }

    public int getFromId() {

        return fromId;
    }

    public void setFromId(int fromId) {

        this.fromId = fromId;
    }

    public String getCopyright() {

        return copyright;
    }

    public void setCopyright(String copyright) {

        this.copyright = copyright;
    }

    public String getPostType() {

        return postType;
    }

    public void setPostType(String postType) {

        this.postType = postType;
    }

    public GeoInfo getGeoInfo() {

        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {

        this.geoInfo = geoInfo;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}
