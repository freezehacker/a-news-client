package com.vita.sjk.zhihudaily.api;

/**
 * Created by sjk on 2016/5/27.
 * <p>
 * 知乎的api列表，都是别人抓取来的
 * 全部使用get请求
 * 参考网址：
 * https://github.com/izzyleung/ZhihuDailyPurify/wiki
 */
public class API {

    /**
     * 获取最新的一系列新闻
     */
    public static final String GET_LATEST_NEWS = "http://news-at.zhihu.com/api/4/news/latest";

    /**
     * 根据id获取某条新闻
     */
    public static final String GET_NEWS_BY_ID = "http://news-at.zhihu.com/api/4/news/%s";

    /**
     * 根据日期获取某一天的一系列新闻
     */
    public static final String GET_NEWS_AT_DATE = "http://news.at.zhihu.com/api/4/news/before/%s";

    /**
     * 根据id，获取对应新闻的额外信息，比如评论数量、赞的数量
     */
    public static final String GET_INFO_OF_THE_NEWS = "http://news-at.zhihu.com/api/4/story-extra/%s";

    /**
     * 新闻对应长评论查看
     */
    public static final String GET_LONG_COMMENTS_BY_ID = "http://news-at.zhihu.com/api/4/story/%s/long-comments";

    /**
     * 新闻对应长评论查看
     */
    public static final String GET_SHORT_COMMENTS_BY_ID = "http://news-at.zhihu.com/api/4/story/%s/short-comments";

    /**
     * 主题查看
     */
    public static final String GET_THEMES = "http://news-at.zhihu.com/api/4/themes";

    /**
     * 根据主题id，查看新闻列表
     */
    public static final String GET_NEWS_BY_THEME = "http://news-at.zhihu.com/api/4/theme/%s";

    /**
     * （慎用）
     * 查看热门新闻
     */
    public static final String GET_HOT_NEWS = "http://news-at.zhihu.com/api/3/news/hot";

    /**
     * 查看栏目(sections)
     */
    public static final String GET_SECTIONS = "http://news-at.zhihu.com/api/3/sections";

    /**
     * 根据栏目id，查看一系列新闻
     */
    public static final String GET_NEWS_BY_SECTION = "http://news-at.zhihu.com/api/3/section/%s";

    /**
     * 栏目的名字
     * 下标对应名称，因为type在json字符串中是int而不是String，比如栏目“2”就是“游戏”
     * 注意，栏目0和1是不存在的
     * 可以让用户定制自己喜欢的sections
     */
    public static final String[] SECTION = new String[]{"", "", "游戏", "电影", "设计", "公司",
            "财经", "音乐", "体育", "动漫", "互联网", "趣事", "推荐", "心理学"};

    /**
     * type=0用于标记带有body字段
     */
    public static final int TYPE_WITH_HTML_BODY = 0;
    /**
     * 相反type=1标记没有body字段的，只有一个share_url
     */
    public static final int TYPE_NO_HTML_BODY = 1;
}
