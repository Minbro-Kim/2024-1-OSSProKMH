import React from "react";
import { Link } from "react-router-dom";
import "./css/Nav.css";

const Top = () => {
  return (
    <nav>
      <ul className="Top">
        <li className="Top_Title">필동2가</li>
        <li className="Top_Sub">
          <img src=""></img>
          스터디모임
        </li>
        <li className="Top_Sub">
          <img src=""></img>
          영화모임
        </li>
        <li className="search-space">원하시는 모임을 검색해주세요</li>
      </ul>
    </nav>
  );
};

export default Top;
