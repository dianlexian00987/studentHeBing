package com.telit.zhkt_three.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.telit.zhkt_three.JavaBean.AppInfo;
import com.telit.zhkt_three.JavaBean.HomeWorkAnswerSave.LocalTextAnswersBean;
import com.telit.zhkt_three.JavaBean.InterActive.DiscussBean;
import com.telit.zhkt_three.JavaBean.LineMatchBean;
import com.telit.zhkt_three.JavaBean.Resource.LocalResourceRecord;
import com.telit.zhkt_three.JavaBean.StudentInfo;
import com.telit.zhkt_three.JavaBean.SingleBean;
import com.telit.zhkt_three.JavaBean.MulitBean;

import com.telit.zhkt_three.greendao.AppInfoDao;
import com.telit.zhkt_three.greendao.LocalTextAnswersBeanDao;
import com.telit.zhkt_three.greendao.DiscussBeanDao;
import com.telit.zhkt_three.greendao.LineMatchBeanDao;
import com.telit.zhkt_three.greendao.LocalResourceRecordDao;
import com.telit.zhkt_three.greendao.StudentInfoDao;
import com.telit.zhkt_three.greendao.SingleBeanDao;
import com.telit.zhkt_three.greendao.MulitBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig appInfoDaoConfig;
    private final DaoConfig localTextAnswersBeanDaoConfig;
    private final DaoConfig discussBeanDaoConfig;
    private final DaoConfig lineMatchBeanDaoConfig;
    private final DaoConfig localResourceRecordDaoConfig;
    private final DaoConfig studentInfoDaoConfig;
    private final DaoConfig singleBeanDaoConfig;
    private final DaoConfig mulitBeanDaoConfig;

    private final AppInfoDao appInfoDao;
    private final LocalTextAnswersBeanDao localTextAnswersBeanDao;
    private final DiscussBeanDao discussBeanDao;
    private final LineMatchBeanDao lineMatchBeanDao;
    private final LocalResourceRecordDao localResourceRecordDao;
    private final StudentInfoDao studentInfoDao;
    private final SingleBeanDao singleBeanDao;
    private final MulitBeanDao mulitBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        appInfoDaoConfig = daoConfigMap.get(AppInfoDao.class).clone();
        appInfoDaoConfig.initIdentityScope(type);

        localTextAnswersBeanDaoConfig = daoConfigMap.get(LocalTextAnswersBeanDao.class).clone();
        localTextAnswersBeanDaoConfig.initIdentityScope(type);

        discussBeanDaoConfig = daoConfigMap.get(DiscussBeanDao.class).clone();
        discussBeanDaoConfig.initIdentityScope(type);

        lineMatchBeanDaoConfig = daoConfigMap.get(LineMatchBeanDao.class).clone();
        lineMatchBeanDaoConfig.initIdentityScope(type);

        localResourceRecordDaoConfig = daoConfigMap.get(LocalResourceRecordDao.class).clone();
        localResourceRecordDaoConfig.initIdentityScope(type);

        studentInfoDaoConfig = daoConfigMap.get(StudentInfoDao.class).clone();
        studentInfoDaoConfig.initIdentityScope(type);

        singleBeanDaoConfig = daoConfigMap.get(SingleBeanDao.class).clone();
        singleBeanDaoConfig.initIdentityScope(type);

        mulitBeanDaoConfig = daoConfigMap.get(MulitBeanDao.class).clone();
        mulitBeanDaoConfig.initIdentityScope(type);

        appInfoDao = new AppInfoDao(appInfoDaoConfig, this);
        localTextAnswersBeanDao = new LocalTextAnswersBeanDao(localTextAnswersBeanDaoConfig, this);
        discussBeanDao = new DiscussBeanDao(discussBeanDaoConfig, this);
        lineMatchBeanDao = new LineMatchBeanDao(lineMatchBeanDaoConfig, this);
        localResourceRecordDao = new LocalResourceRecordDao(localResourceRecordDaoConfig, this);
        studentInfoDao = new StudentInfoDao(studentInfoDaoConfig, this);
        singleBeanDao = new SingleBeanDao(singleBeanDaoConfig, this);
        mulitBeanDao = new MulitBeanDao(mulitBeanDaoConfig, this);

        registerDao(AppInfo.class, appInfoDao);
        registerDao(LocalTextAnswersBean.class, localTextAnswersBeanDao);
        registerDao(DiscussBean.class, discussBeanDao);
        registerDao(LineMatchBean.class, lineMatchBeanDao);
        registerDao(LocalResourceRecord.class, localResourceRecordDao);
        registerDao(StudentInfo.class, studentInfoDao);
        registerDao(SingleBean.class, singleBeanDao);
        registerDao(MulitBean.class, mulitBeanDao);
    }
    
    public void clear() {
        appInfoDaoConfig.clearIdentityScope();
        localTextAnswersBeanDaoConfig.clearIdentityScope();
        discussBeanDaoConfig.clearIdentityScope();
        lineMatchBeanDaoConfig.clearIdentityScope();
        localResourceRecordDaoConfig.clearIdentityScope();
        studentInfoDaoConfig.clearIdentityScope();
        singleBeanDaoConfig.clearIdentityScope();
        mulitBeanDaoConfig.clearIdentityScope();
    }

    public AppInfoDao getAppInfoDao() {
        return appInfoDao;
    }

    public LocalTextAnswersBeanDao getLocalTextAnswersBeanDao() {
        return localTextAnswersBeanDao;
    }

    public DiscussBeanDao getDiscussBeanDao() {
        return discussBeanDao;
    }

    public LineMatchBeanDao getLineMatchBeanDao() {
        return lineMatchBeanDao;
    }

    public LocalResourceRecordDao getLocalResourceRecordDao() {
        return localResourceRecordDao;
    }

    public StudentInfoDao getStudentInfoDao() {
        return studentInfoDao;
    }

    public SingleBeanDao getSingleBeanDao() {
        return singleBeanDao;
    }

    public MulitBeanDao getMulitBeanDao() {
        return mulitBeanDao;
    }

}
