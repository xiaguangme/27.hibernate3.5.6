/*
 * 文 件 名:  Team.java
 * 版    权:   . Copyright 2008-2016,  All rights reserved Beijing Kinchany Science and Technology Co.,Ltd.
 * 描    述:  <描述>
 * 修 改 人:  simon
 * 修改时间:  2017年4月28日
 */
package org.simonme.srcstudy.hibernate3.demo.mysql.crud.bean;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  simon
 * @version  [版本号, 2017年4月28日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Team
{
    private Long id;
    
    private String teamName;

   

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }
}
