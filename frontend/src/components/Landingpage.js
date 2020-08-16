import React from 'react';
import styled from 'styled-components';
import landingPic from '../imgs/auto4.jpg';


const Div = styled.div`
    text-align: center;
    padding: 19em 0em;
    background-image: linear-gradient(to bottom, rgba(0,0,0,0.1) 0%,rgba(0,0,0,0.1) 100%), url(${landingPic});
    background-size: cover;
    background-position: center;
    min-width: 100%;
    min-height: 100%;
    box-shadow: inset 0 0 100px #000; 
`

export default function Landingpage() {
    return (
        <div id='openSection'>
            <Div>
            <h1>helly te rutyutyu</h1>

            </Div>

        </div>
    )
}
