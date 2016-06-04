package com.dvp.base.fenwu.yunjicuo.domain.student;

/**
 * 作者：Administrator on 2016/6/3 15:55
 * <p/>
 * 功能描述:判卷完成
 */
public class RtnPanJWanC
{


    private String id;
    private StudentEntity student;
    private int yiPJ;

    private HomeworkEntity homework;
    private int yiShJ;

    private BanJEntity banJ;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public StudentEntity getStudent()
    {
        return student;
    }

    public void setStudent(StudentEntity student)
    {
        this.student = student;
    }

    public int getYiPJ()
    {
        return yiPJ;
    }

    public void setYiPJ(int yiPJ)
    {
        this.yiPJ = yiPJ;
    }

    public HomeworkEntity getHomework()
    {
        return homework;
    }

    public void setHomework(HomeworkEntity homework)
    {
        this.homework = homework;
    }

    public int getYiShJ()
    {
        return yiShJ;
    }

    public void setYiShJ(int yiShJ)
    {
        this.yiShJ = yiShJ;
    }

    public BanJEntity getBanJ()
    {
        return banJ;
    }

    public void setBanJ(BanJEntity banJ)
    {
        this.banJ = banJ;
    }

    public static class StudentEntity
    {
        private String id;
        private String state;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public String getState()
        {
            return state;
        }

        public void setState(String state)
        {
            this.state = state;
        }
    }

    public static class HomeworkEntity
    {
        private String id;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }
    }

    public static class BanJEntity
    {
        private String id;

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }
    }
}


