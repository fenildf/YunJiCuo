package com.dvp.base.fenwu.yunjicuo.domain.student;

/**
 * 作者：Administrator on 2016/6/3 13:35
 * <p/>
 * 功能描述:YunJiCuo
 */
public class RtnSetFalse
{

    /**
     * id : e549102454f10512015514c06f520283
     * homeworkQuestion : {"id":"e549102454f10512015509d8c1850159"}
     * student : {"id":"e54910245143f90301514778082d088f","state":"正常"}
     * duiC : false
     * banJ : {"id":"00000261"}
     */

    private String id;
    /**
     * id : e549102454f10512015509d8c1850159
     */

    private HomeworkQuestionEntity homeworkQuestion;
    /**
     * id : e54910245143f90301514778082d088f
     * state : 正常
     */

    private StudentEntity student;
    private boolean duiC;
    /**
     * id : 00000261
     */

    private BanJEntity banJ;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public HomeworkQuestionEntity getHomeworkQuestion()
    {
        return homeworkQuestion;
    }

    public void setHomeworkQuestion(HomeworkQuestionEntity homeworkQuestion)
    {
        this.homeworkQuestion = homeworkQuestion;
    }

    public StudentEntity getStudent()
    {
        return student;
    }

    public void setStudent(StudentEntity student)
    {
        this.student = student;
    }

    public boolean isDuiC()
    {
        return duiC;
    }

    public void setDuiC(boolean duiC)
    {
        this.duiC = duiC;
    }

    public BanJEntity getBanJ()
    {
        return banJ;
    }

    public void setBanJ(BanJEntity banJ)
    {
        this.banJ = banJ;
    }

    public static class HomeworkQuestionEntity
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


