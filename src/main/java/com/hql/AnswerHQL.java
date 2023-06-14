package com.hql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerHQL {

	@Id
	private int ansId;
	private String answer;

	@ManyToOne
	private QuestionHQL question;

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public QuestionHQL getQuestion() {
		return question;
	}

	public void setQuestion(QuestionHQL question) {
		this.question = question;
	}

	public AnswerHQL(int ansId, String answer, QuestionHQL question) {
		super();
		this.ansId = ansId;
		this.answer = answer;
		this.question = question;
	}

	public AnswerHQL() {
		super();
	}

	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", answer=" + answer + ", question=" + question + "]";
	}

}
