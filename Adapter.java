public class Adapter extends RecyclerView.Adapter<VideoViewHolder> {

    private Context context;
    private ArrayList<VideoBean> list;

    public Adapter(Context context, ArrayList<VideoBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.view___play_video_viewpager_item, parent, false);
        return new VideoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        String videoUrl = "list.get(position).getVideoUser()+"/" + list.get(position).getSourceFileName();
        holder.bindData(videoUrl);
        String coverUrl = "list.get(position).getVideoUser() + "/cover/" + list.get(position).getCoverFileName();
        holder.setPreImage(context,coverUrl);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
