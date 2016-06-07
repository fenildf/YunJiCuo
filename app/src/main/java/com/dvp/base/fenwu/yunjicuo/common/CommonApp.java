package com.dvp.base.fenwu.yunjicuo.common;

import android.content.Context;

import com.dvp.base.app.APP;
import com.dvp.base.fenwu.yunjicuo.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.nostra13.universalimageloader.utils.StorageUtils;

import java.io.File;

/**
 * 类: ProjectNameApp
 * 功能描述:
 * 创建人: 田翔
 * 创建日期: 2016/4/20 09:14
 * 开发环境: JDK1.8
 */
public class CommonApp extends APP
{
    private static CommonApp ourInstance = new CommonApp();

    public static CommonApp getInstance() {
        return ourInstance;
    }


    /**
     * 班级编号
     */
    private String banJBH = "";
    public String getBanJBH()
    {
        return banJBH;
    }

    public void setBanJBH(String banJBH)
    {
        this.banJBH = banJBH;
    }

    //多选图片相关
    public static final int SELECTEDMODE = 1;
    public static final int MAXNUM = 9;
    public static int PICSIZE = 0;
    public static final boolean SHOW_CAMERA = true;
    public static final String EXTRA_CURRENT_IMG_POSITION = "current_img_position";

    @Override
    public void onCreate() {
        super.onCreate();

        ourInstance = this;

        //图片缓存框架
        initImageLoader(getApplicationContext());
        Fresco.initialize(getApplicationContext());


    }


    /*
	 * 配置过程： 1.导入 Universal-Image-Loader的jar包到libs下面 2.在manifest中加入权限
	 * 3.在Application中加入全局图片库配置 4. ImageLoader.getInstance().init(config);//
	 * 全局初始化此配置 5. 在要使用的地方调用 ImageLoader.getInstance()来获得要显示的方法
	 *
	 * 图片加载库的配置：
	 * Universal-Image-Loader框架:虽然这个框架有很好的缓存机制，有效的避免了OOM的产生，一般的情况下产生OOM的概率比较小，
	 * 但是并不能保证OutOfMemoryError永远不发生
	 * ，这个框架对于OutOfMemoryError做了简单的catch,保证我们的程序遇到OOM而不被crash掉
	 * ，但是如果我们使用该框架经常发生OOM，我们应该怎么去改善呢？
	 * 减少线程池中线程的个数，在ImageLoaderConfiguration中的（.threadPoolSize）中配置，推荐配置1-5
	 * 在DisplayImageOptions选项中配置bitmapConfig为Bitmap
	 * .Config.RGB_565，因为默认是ARGB_8888， 使用RGB_565会比使用ARGB_8888少消耗2倍的内存
	 * 在ImageLoaderConfiguration中配置图片的内存缓存为memoryCache(new WeakMemoryCache())
	 * 或者不使用内存缓存
	 * 在DisplayImageOptions选项中设置.imageScaleType(ImageScaleType.IN_SAMPLE_INT
	 * )或者imageScaleType(ImageScaleType.EXACTLY) ImageScaleType: EXACTLY
	 * :图像将完全按比例缩小的目标大小
	 *
	 * EXACTLY_STRETCHED:图片会缩放到目标大小完全
	 *
	 * IN_SAMPLE_INT:图像将被二次采样的整数倍
	 *
	 * IN_SAMPLE_POWER_OF_2:图片将降低2倍，直到下一减少步骤，使图像更小的目标大小
	 *
	 * NONE:图片不会调整
	 */
    public void initImageLoader(Context context)
    {
        File cacheDir = StorageUtils.getOwnCacheDirectory(
                getApplicationContext(), "imageloader/Cache");// 设置自己的缓存目录
        @SuppressWarnings("deprecation")
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .showImageForEmptyUri(R.mipmap.default_image) // 空Uri显示的图片
                // 可自定义设置
                .showImageOnFail(R.mipmap.default_image) // 显示失败时默认显示的图片 可自定义设置
                .cacheInMemory(true).cacheOnDisc(true).build();

        @SuppressWarnings("deprecation")
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                getApplicationContext())
                .discCache(new UnlimitedDiskCache(cacheDir))
                // /缓存路径
                .defaultDisplayImageOptions(defaultOptions)
                .discCacheSize(50 * 1024 * 1024)
                // 硬盘缓存50MB
                .discCacheFileCount(100)
                // 缓存的文件数量
                .imageDownloader(
                        new BaseImageDownloader(context, 5 * 1000, 30 * 1000))
                // connectTimeout (5 s), readTimeout (30 s)超时时间
                .threadPoolSize(3)
                // 减少线程池中线程的个数，在ImageLoaderConfiguration中的（.threadPoolSize）中配置，推荐配置1-5
                .threadPriority(Thread.NORM_PRIORITY - 2)
                // 线程优先级
                .denyCacheImageMultipleSizesInMemory()
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .writeDebugLogs().build();

        ImageLoader.getInstance().init(config);// 全局初始化此配置
    }
}
