package com.example.pojo;

import java.util.List;

public class PageBean {
    private long count;
    private List pageList;

    public PageBean() {
    }

    public PageBean(long count, List pageList) {
        this.count = count;
        this.pageList = pageList;
    }

    /**
     * 获取
     * @return count
     */
    public long getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(long count) {
        this.count = count;
    }

    /**
     * 获取
     * @return pageList
     */
    public List getPageList() {
        return pageList;
    }

    /**
     * 设置
     * @param pageList
     */
    public void setPageList(List pageList) {
        this.pageList = pageList;
    }

    public String toString() {
        return "PageBean{count = " + count + ", pageList = " + pageList + "}";
    }
}
