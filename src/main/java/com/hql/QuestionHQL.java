package com.hql;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class QuestionHQL {

	@Id
	private int queId;
	private String quetion;

	@OneToMany(mappedBy = "question")
	private List<AnswerHQL> answer;

	public int getQueId() {
		return queId;
	}

	public void setQueId(int queId) {
		this.queId = queId;
	}

	public String getQuetion() {
		return quetion;
	}

	public void setQuetion(String quetion) {
		this.quetion = quetion;
	}

	public List<AnswerHQL> getAnswer() {
		return answer;
	}

	public void setAnswer(List<AnswerHQL> answer) {
		this.answer = answer;
	}

	public QuestionHQL(int queId, String quetion, List<AnswerHQL> answer) {
		super();
		this.queId = queId;
		this.quetion = quetion;
		this.answer = answer;
	}

	public QuestionHQL() {
		super();
	}

	@Override
	public String toString() {
		return "Question [queId=" + queId + ", quetion=" + quetion + ", answer=" + answer + "]";
	}

}
