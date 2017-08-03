package testspider;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Zhihu {
 public String question;// 问题
 public String questionDescription;// 问题描述
 public String zhihuUrl;// 网页链接
 public ArrayList<String> answers;// 存储所有回答的数组
 // 构造方法初始化数据
 public Zhihu() {
  // 初始化属性
  question = "";
  questionDescription = "";
  zhihuUrl = "";
  answers = null;

 }
 // 根据自己的url抓取自己的问题和描述和答案
 public boolean getAll() {
  return true;
 }
 // 处理url
 boolean getRealUrl(String url) {
  // 将http://www.zhihu.com/question/22355264/answer/21102139
  // 转化成http://www.zhihu.com/question/22355264
  // 否则不变
  Pattern pattern = Pattern.compile("question/(.*?)/");
  Matcher matcher = pattern.matcher(url);
  if (matcher.find()) {
   zhihuUrl = "http://www.zhihu.com/question/" + matcher.group(1);
  } else {
   return false;
  }
  return true;
 }
 @Override
 public String toString() {
  return "问题：" + question + "\n" + "描述：" + questionDescription + "\n"
    + "链接：" + zhihuUrl + "\n回答：" + answers.size() + "\n";
 }
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getQuestionDescription() {
	return questionDescription;
}
public void setQuestionDescription(String questionDescription) {
	this.questionDescription = questionDescription;
}
public String getZhihuUrl() {
	return zhihuUrl;
}
public void setZhihuUrl(String zhihuUrl) {
	this.zhihuUrl = zhihuUrl;
}
public ArrayList<String> getAnswers() {
	return answers;
}
public void setAnswers(ArrayList<String> answers) {
	this.answers = answers;
}
 
}
