package com.chen.fakevibrato.ui.home.contract;

import com.chen.baselibrary.base.BasePresenter;
import com.chen.baselibrary.base.BaseView;
import com.chen.fakevibrato.LoginActivity;


/**
 * @author Created by CHEN on 2019/6/11
 * @email 188669@163.com
 */
public interface LoginContract {

    interface View extends BaseView {
    }
    abstract class Presenter extends BasePresenter<LoginActivity> {

    }
}
