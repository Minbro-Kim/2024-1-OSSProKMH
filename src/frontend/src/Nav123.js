import React from "react";
import { Link } from "react-router-dom";
import "./css/Nav.css";

const Nav = () => {
  return (
    <nav className="bottom-nav">
      <ul>
        <li>
          <Link to="/">홈</Link>
        </li>
        <li>
          <Link to="/manage">모임관리</Link>
        </li>
        <li>
          <Link to="/chat">채팅</Link>
        </li>
        <li>
          <Link to="/notice">공지사항</Link>
        </li>
        <li>
          <Link to="/mypage">마이페이지</Link>
        </li>
      </ul>
    </nav>
  );
};

export default Nav;
