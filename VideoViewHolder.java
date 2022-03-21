public class VideoViewHolder extends RecyclerView.ViewHolder {
    private ExoUserPlayer userPlayer;
    private VideoPlayerView playerView;


    public VideoViewHolder(@NonNull View itemView) {
        super(itemView);
        playerView = itemView.findViewById(R.id.video_view);
        userPlayer = new VideoPlayerManager.Builder(VideoPlayerManager.TYPE_PLAY_USER,
                playerView).setDataSource(new PlayVideoDataSource(itemView.getContext())).create();
    }

    public void setPreImage(Context context, String imageUrl) {
        Glide.with(context).load(imageUrl).into(playerView.getPreviewImage());
    }

    public void bindData(String string) {
        userPlayer.setPlayUri(string);
    }
}
